package com.mm.dao.annotation;

import java.lang.annotation.*;

/**
 * @author mmn
 * @date 2020/4/26
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PersonSexTest {

    /**
     * 性别
     */
    public enum Sex{Man, WOMAN};

    /**
     * 性别属性
     */
    Sex personSex() default Sex.Man;
}
