package com.mm.dao.util;

import com.mm.dao.annotation.LogAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author mmn
 * @date 2020/4/27
 */
@Aspect
public class LogAnnotationAnalytic {

//    @Before("execution(*com.mm...(..))&& @annotation(logAnnotation)")
//    @Before("execution(* com.mm.dao.annotation...(..)) && @annotation(logAnnotation)")
    public void logAnnotation(final JoinPoint joinPoint, LogAnnotation logAnnotation) {
        try {
            Object[] args = joinPoint.getArgs();
            System.out.println("-------------------注解成功---------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
