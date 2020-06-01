package com.mm.dao.annotation;

import java.lang.annotation.*;

/**
 * @author mmn
 * @date 2020/4/26
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PersonNameTest {
    String value() default "";
}
