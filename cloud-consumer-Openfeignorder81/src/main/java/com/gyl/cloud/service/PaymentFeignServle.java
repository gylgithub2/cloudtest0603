package com.gyl.cloud.service;/*
@author gyl
@creat 2020-06-05-13:10:15
*/

import com.gyl.cloud.entities.CommonResult;
import com.gyl.cloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignServle {
    @GetMapping("Payment/{id}")
    CommonResult<Payment> getOne(@PathVariable("id") Long id);
}
