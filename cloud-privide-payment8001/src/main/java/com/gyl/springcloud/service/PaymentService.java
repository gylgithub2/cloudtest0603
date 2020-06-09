package com.gyl.springcloud.service;/*
@author gyl
@creat 2020-06-03-17:09:10
*/

import com.gyl.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;


public interface PaymentService {
    public int insert(Payment payment);
    public Payment getOne(@Param("id") Long id);
}
