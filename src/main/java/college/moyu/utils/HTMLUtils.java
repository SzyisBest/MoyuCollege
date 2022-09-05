package college.moyu.utils;

import com.github.houbb.sensitive.word.bs.SensitiveWordBs;

/**
 * @author 古丶野
 * @version 1.0
 * @project MoyuCollege
 * @description HTML 工具类
 * @date 2022/9/5 17:34:07
 */
public class HTMLUtils {
    private static final SensitiveWordBs WORD_BS = SensitiveWordBs.newInstance()
            .ignoreCase(true)
            .ignoreWidth(true)
            .ignoreNumStyle(true)
            .ignoreChineseStyle(true)
            .ignoreEnglishStyle(true)
            .ignoreRepeat(true)
            .enableNumCheck(false)
            .enableEmailCheck(false)
            .enableUrlCheck(false)
            .init();
    /**
     * 删除标签
     *
     * @param source 需要进行剔除HTML的文本
     * @return 过滤后的内容
     */
    public static String deleteTag(String source) {
        // 敏感词过滤
        source = WORD_BS.replace(source);
        // 保留图片标签
        source = source.replaceAll("(?!<(img).*?>)<.*?>", "")
                .replaceAll("(on[^\"]+)", "");
        return deleteHMTLTag(source);
    }

    public static String checkSql(String message){
        return SensitiveUtils.filter(message);
    }

    /**
     * 删除标签
     *
     * @param source 文本
     * @return 过滤后的文本
     */
    private static String deleteHMTLTag(String source) {
        // 删除转义字符
        source = source.replaceAll("&.{2,6}?;", "");
        // 删除script标签
        source = source.replaceAll("<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>", "");
        // 删除style标签
        source = source.replaceAll("<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>", "");
        return source;
    }
}
