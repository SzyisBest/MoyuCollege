package college.moyu.annotation;

import java.lang.annotation.*;

/**
 * @author 古丶野
 * @version 1.0
 * @project MoyuCollege
 * @description 操作日志注解
 * @date 2022/9/5 17:42:01
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OptLog {
    /**
     * @return 操作类型
     */
    String optType() default "";
}
