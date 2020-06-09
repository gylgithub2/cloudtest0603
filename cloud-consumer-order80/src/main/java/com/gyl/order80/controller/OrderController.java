package com.gyl.order80.controller;/*
@author gyl
@creat 2020-06-03-18:59:21
*/


import com.gyl.cloud.entities.CommonResult;
import com.gyl.cloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@Slf4j
public class OrderController {

//    private static final String requestURL = "http://localhost:8001/Payment/";
    private static final String requestURL = "http://CLOUD-PAYMENT-SERVICE/Payment/";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/order/payment/{id}")
    public CommonResult getPayment(@PathVariable Long id){
        return restTemplate.getForObject(requestURL+id,CommonResult.class);
    }
    @PostMapping("/order/payment/create")
    public CommonResult getPayment(Payment payment){
        AtomicInteger atomicInteger = new AtomicInteger();
        return restTemplate.postForObject(requestURL+"insert",payment,CommonResult.class);
    }

}
