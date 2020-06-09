package spring.cloud.seataOrder.controller;/*
@author gyl
@creat 2020-06-08-17:29:21
*/

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.seataOrder.domain.CommonResult;
import spring.cloud.seataOrder.domain.Order;
import spring.cloud.seataOrder.service.OrderService;

import javax.annotation.Resource;

@RestController
public class OrderController {
    @Resource
    OrderService orderService;
    @PostMapping("order/create")
    CommonResult insertOrder(Order order){
        orderService.insertOder(order);
        return new CommonResult(200,"订单创建成功!");
    }
}
