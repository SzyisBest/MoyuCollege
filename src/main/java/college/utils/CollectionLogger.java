package college.utils;

import java.lang.annotation.*;

/**
 * @program: coc
 * @description: 收集日志记录器
 * @author: Mr.Sheng
 * @create: 2021-12-09 14:33
 **/
@Documented
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)

public @interface CollectionLogger {
    String Description() default "";

    String OpreationType() default "";
}
