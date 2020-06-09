package spring.cloud.seataOrder.dao;/*
@author gyl
@creat 2020-06-08-16:29:56
*/

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import spring.cloud.seataOrder.domain.Order;

@Mapper
public interface OrderDao {
    void insertOrder(Order order);
    int updateOrder(@Param("userId") Long userId,@Param("status") Integer status);
}
