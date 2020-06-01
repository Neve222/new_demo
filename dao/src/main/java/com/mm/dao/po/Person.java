package com.mm.dao.po;

import com.mm.dao.annotation.PersonNameTest;
import com.mm.dao.annotation.PersonSexTest;
import lombok.Data;

/**
 * @author mmn
 * @date 2020/4/26
 */
@Data
public class Person {
    @PersonSexTest(personSex = PersonSexTest.Sex.WOMAN)
    private String sex;

    @PersonNameTest("测试注解")
    private String name;


}
