package com.gyl.cloud;/*
@author gyl
@creat 2020-06-05-13:07:19
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Order81Main {
    public static void main(String[] args) {
        SpringApplication.run(Order81Main.class,args);
    }
}
