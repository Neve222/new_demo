package com.mm.controller;

import com.mm.business.service.TestService;
import com.mm.dao.po.Person;
import com.mm.dao.util.PersonInfoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test
 *
 * @author mmn
 * @date 2020/4/24
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/test1")
    public String test1() {
        return testService.test1();
    }

    @GetMapping("/test2")
    public void test2() {
        PersonInfoUtil.getPersonInfo(Person.class);
    }
}
