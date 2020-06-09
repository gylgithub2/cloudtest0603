package com.gyl.cloud.controller;/*
@author gyl
@creat 2020-06-05-13:18:03
*/

import com.gyl.cloud.entities.CommonResult;
import com.gyl.cloud.entities.Payment;
import com.gyl.cloud.service.PaymentFeignServle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderFeignController {
    @Resource
    private  PaymentFeignServle paymentFeignServle;
    @GetMapping("/order/payment/{id}")
    public CommonResult<Payment> getOne(@PathVariable("id") Long id){
        return paymentFeignServle.getOne(id);
    }
}
