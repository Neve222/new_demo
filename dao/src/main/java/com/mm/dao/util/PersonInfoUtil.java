package com.mm.dao.util;

import com.mm.dao.annotation.PersonNameTest;
import com.mm.dao.annotation.PersonSexTest;

import java.lang.reflect.Field;

/**
 * 注解处理器
 * @author mmn
 * @date 2020/4/26
 */
public class PersonInfoUtil {
    public static void getPersonInfo(Class<?> clazz) {
        String strPersonName = "人名:";
        String strPersonSex = "性别";

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(PersonNameTest.class)) {
                PersonNameTest personName = field.getAnnotation(PersonNameTest.class);
                strPersonName = strPersonName + personName.value();
                System.out.println(strPersonName);
            } else if(field.isAnnotationPresent(PersonSexTest.class)) {
                PersonSexTest personSex = field.getAnnotation(PersonSexTest.class);
                strPersonSex = strPersonSex + personSex.personSex().toString();
                System.out.println(strPersonSex);
            }
        }
    }
}
