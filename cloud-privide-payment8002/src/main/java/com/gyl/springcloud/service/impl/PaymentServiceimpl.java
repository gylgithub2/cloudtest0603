package com.gyl.springcloud.service.impl;/*
@author gyl
@creat 2020-06-03-17:10:25
*/

import com.gyl.cloud.entities.Payment;
import com.gyl.springcloud.dao.PaymentDao;
import com.gyl.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceimpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;
    @Override
    public int insert(Payment payment) {
        return paymentDao.insert(payment);
    }

    @Override
    public Payment getOne(Long id) {
        return paymentDao.getOne(id);
    }
}
