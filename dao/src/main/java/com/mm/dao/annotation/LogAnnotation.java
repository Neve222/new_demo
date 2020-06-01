package com.mm.dao.annotation;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

/**
 * @author mmn
 * @date 2020/4/27
 */

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface LogAnnotation {

    String behaviorDes() default "";
}
