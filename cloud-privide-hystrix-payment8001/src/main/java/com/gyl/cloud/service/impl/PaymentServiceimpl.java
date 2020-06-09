package com.gyl.cloud.service.impl;/*
@author gyl
@creat 2020-06-03-17:10:25
*/

import com.gyl.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceimpl implements PaymentService {

    @Override
    public String find() {
        return Thread.currentThread().getName()+"=====ToT";
    }

    @Override
    public String finxerror() throws InterruptedException {
        Thread.sleep(3000);

        return "==error=="+Thread.currentThread().getName()+"=====ToT";
    }
}
