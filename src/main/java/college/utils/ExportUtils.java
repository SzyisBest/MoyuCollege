package college.utils;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.exception.ExcelDataConvertException;
import com.alibaba.excel.metadata.CellExtra;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.fastjson.JSONObject;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * @author hhh
 * @description 导出excelUtils
 * @creationTime 2021/11/5 11:08
 */
public class ExportUtils {
    private static final Logger logger = LoggerFactory.getLogger(ExportUtils.class);

//    public static <E> void export(IRequestArgumentBody requestArgument, VoConvertJson<E> convert, List<E> dataList, OutputStream outputStream) {
//        export(requestArgument, convert, dataList, outputStream, "数据导出");
//    }
//
//    public static <E> void export(IRequestArgumentBody requestArgument, VoConvertJson<E> convert, List<E> dataList, OutputStream outputStream, String title) {
//        if (dataList == null || dataList.isEmpty()) {
//            try {
//                outputStream.write(new byte[]{});
//                return;
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        List<JSONObject> jsonList = dataList.stream().map(convert::convert).collect(Collectors.toList());
//        List<JSONObject> col = requestArgument.getObjects("col", JSONObject.class);//表格列头
//        GenerateExcel generateExcel = new GenerateExcel();//工具类
//        try (XSSFWorkbook workbook = generateExcel.generateExcels(col, jsonList, title, null)) {
//            workbook.write(outputStream);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


    public static <E> List<E> read(InputStream is, Class<? extends E> header, int headNum, int sheetIndex) throws Exception {
        Map<Integer, List<E>> map = new HashMap<>();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        MyPageReadListener<E> readListener = new MyPageReadListener<>(list -> {
            map.put(0, list);
            countDownLatch.countDown();
        });
        try {
            EasyExcel
                    .read(is, header, readListener)
                    .headRowNumber(headNum)
                    .sheet(sheetIndex)
                    .doRead();
        } catch (Exception e) {
            logger.error("文件格式错误");
            e.printStackTrace();
            throw e;
        }
        countDownLatch.await();
        if (readListener.isOverflow) throw new Exception("最多导出5000条");
        return map.get(0);
    }

    public static <E> List<E> read(InputStream is, int headNum, int sheetIndex) throws Exception {
        Map<Integer, List<E>> map = new HashMap<>();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        MyPageReadListener<E> readListener = new MyPageReadListener<>(list -> {
            map.put(0, list);
            countDownLatch.countDown();

        });
        try {
            EasyExcel
                    .read(is, readListener)
                    .headRowNumber(headNum)
                    .sheet(sheetIndex)
                    .doRead();
        } catch (Exception e) {
            logger.error("文件格式错误");
            e.printStackTrace();
            throw e;
        }
        countDownLatch.await();
        if (readListener.isOverflow) throw new Exception("最多导出5000条");
        return map.get(0);
    }


    public static <E> List<E> read(InputStream is, Class<? extends E> header, int headNum) throws Exception {
        return read(is, header, headNum, 0);
    }

    public static <E> List<E> read(InputStream is, Class<? extends E> header) throws Exception {
        return read(is, header, 1);
    }


    private static class MyPageReadListener<E> implements ReadListener<E> {
        public static final int BATCH_COUNT = 5000;
        /**
         * Temporary storage of data
         */
        private List<E> cachedData = new ArrayList<E>(BATCH_COUNT);

        private final Consumer<List<E>> consumer;

        private boolean isOverflow = false;

        public MyPageReadListener(Consumer<List<E>> consumer) {
            this.consumer = consumer;
        }


        @Override
        public void invoke(E data, AnalysisContext analysisContext) {
            if (cachedData.size() > BATCH_COUNT) {
                isOverflow = true;
                return;
            }
            cachedData.add(data);
        }

        @Override
        public void extra(CellExtra cellExtra, AnalysisContext analysisContext) {

        }

        @Override
        public void doAfterAllAnalysed(AnalysisContext analysisContext) {
            consumer.accept(cachedData);
        }

        @Override
        public boolean hasNext(AnalysisContext analysisContext) {
            return true;
        }


        @Override
        public void onException(Exception exception, AnalysisContext context) throws Exception {
            logger.error("解析失败，但是继续解析下一行:{}", exception.getMessage());
            // 如果是某一个单元格的转换异常 能获取到具体行号
            // 如果要获取头的信息 配合invokeHeadMap使用
            if (exception instanceof ExcelDataConvertException) {
                ExcelDataConvertException excelDataConvertException = (ExcelDataConvertException) exception;
                logger.error("第{}行，第{}列解析异常", excelDataConvertException.getRowIndex() + 1, excelDataConvertException.getColumnIndex() + 1);
                throw new Exception("模板解析第" + (excelDataConvertException.getRowIndex() + 1) + "行,第" + (excelDataConvertException.getColumnIndex() + 1) + "列解析异常");
            }
        }


        public boolean isOverflow() {
            return isOverflow;
        }
    }
}
