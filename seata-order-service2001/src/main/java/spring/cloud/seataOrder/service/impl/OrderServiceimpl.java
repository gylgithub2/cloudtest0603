package spring.cloud.seataOrder.service.impl;/*
@author gyl
@creat 2020-06-08-16:48:49
*/

import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import spring.cloud.seataOrder.dao.OrderDao;
import spring.cloud.seataOrder.domain.Order;
import spring.cloud.seataOrder.service.AccountService;
import spring.cloud.seataOrder.service.OrderService;
import spring.cloud.seataOrder.service.StorageService;

import javax.annotation.Resource;

@Service
@Slf4j
public class OrderServiceimpl implements OrderService {


    @Resource
    OrderDao orderDao;

    @Resource
    StorageService storageService;

    @Resource
    AccountService accountService;

    @GlobalTransactional(name="xxx-wds-sdd",rollbackFor = Exception.class)
    @Override
    public void insertOder(Order order) {
        log.info("创建订单。。。。。。。。。");
        orderDao.insertOrder(order);
        log.info("减少库存。。。。。。。。。");
        storageService.decreate(order.getProductId(),order.getCount());
        log.info("账户余额扣减 。。。。。。。。。");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("修改订单状态  0 -> 1");
        orderDao.updateOrder(order.getUserId(),0);
        log.info("结束。。。。。。。。。。。");
    }
}
