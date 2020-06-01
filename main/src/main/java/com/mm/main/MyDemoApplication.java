package com.mm.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author mmn
 * @date 2020/4/26
 */

@SpringBootApplication(scanBasePackages = {"com.mm"})
public class MyDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyDemoApplication.class, args);
    }
}
