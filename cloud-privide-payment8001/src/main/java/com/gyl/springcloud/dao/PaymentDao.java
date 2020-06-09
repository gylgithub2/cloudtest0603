package com.gyl.springcloud.dao;/*
@author gyl
@creat 2020-06-03-16:42:36
*/

import com.gyl.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public int insert(Payment payment);
    public Payment getOne(@Param("id") Long id);

}
