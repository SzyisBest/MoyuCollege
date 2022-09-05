package college.moyu.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

/**
 * @program: coc
 * @description: 注册收集日志记录器的注解处理器
 * @author: Mr.Sheng
 * @create: 2021-12-09 14:58
 **/
@Aspect
@Component
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class RegisterCollectionLoggerAnnotation {

    @Pointcut(value = "@annotation(college.moyu.utils.CollectionLogger)")
    public void menuTreeAspect() {
    }

    @Around(value = "menuTreeAspect()")
    public Object appendLog(ProceedingJoinPoint point) {
        MethodSignature methodSignature = (MethodSignature) point.getSignature();
        Method method = methodSignature.getMethod();
        Parameter[] parameters = method.getParameters();
        CollectionLogger methodAnnotation = method.getAnnotation(CollectionLogger.class);
        System.out.println("====================日志记录start====================");
        // 方法描述
        String methodMessage = methodAnnotation.Description();
        System.out.println("方法描述:" + methodMessage);
        // 获取操作类型
        String methodOperationType = methodAnnotation.OpreationType();
        System.out.println("操作类型:" + methodOperationType);
        // 方法名称
        String methodName = method.getName();
        System.out.println("方法名称:" + methodName);
        // 获取参数的列表
        StringBuilder parameterStr = new StringBuilder("[");
        Arrays.stream(parameters).forEach(parameter -> parameterStr.append(parameter.getName()).append(","));
        String paramString = parameterStr.substring(0, parameterStr.length() - 1) + "]";
        System.out.println("参数的列表:" + paramString);
        System.out.println("=====================日志记录end=====================");
        return method;
    }
}
