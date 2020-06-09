package spring.cloud.seataOrder.service;/*
@author gyl
@creat 2020-06-08-16:47:37
*/

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import spring.cloud.seataOrder.domain.Order;

@EnableDiscoveryClient
public interface OrderService {
    void insertOder(Order order);
}
