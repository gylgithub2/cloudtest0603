package com.gyl.cloud.controller;/*
@author gyl
@creat 2020-06-03-17:14:48
*/

import com.gyl.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @GetMapping("/payment/find")
    public String find(){
       return paymentService.find();
    }
    @GetMapping("/payment/finderror")
    public String finderror() throws InterruptedException {
       return paymentService.finxerror();

    }

}
