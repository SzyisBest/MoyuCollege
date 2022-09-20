package college.moyu.utils;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RequestBody {
    public static JSONObject RequestBodyExplain(HttpServletRequest httpServletRequest) {
        JSONObject result = null;
        try {
            //从前端获取输入字节流
            ServletInputStream requestInputStream = httpServletRequest.getInputStream();
            //将字节流转换为字符流,并设置字符编码为utf-8
            InputStreamReader ir = null;
            ir = new InputStreamReader(requestInputStream, "utf-8");
            //使用字符缓冲流进行读取
            BufferedReader br = new BufferedReader(ir);
            //开始拼装json字符串
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            result = JSONObject.parseObject(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
