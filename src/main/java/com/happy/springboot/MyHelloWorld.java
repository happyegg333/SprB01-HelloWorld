package com.happy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication springboot应用的标注
 */
@SpringBootApplication
public class MyHelloWorld {
    public static void main(String[] args) {
        //启动SpringBoot
        SpringApplication.run(MyHelloWorld.class,args);
    }
}