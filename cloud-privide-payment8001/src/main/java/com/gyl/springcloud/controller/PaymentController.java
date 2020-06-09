package com.gyl.springcloud.controller;/*
@author gyl
@creat 2020-06-03-17:14:48
*/

import com.gyl.cloud.entities.CommonResult;
import com.gyl.cloud.entities.Payment;
import com.gyl.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    /**
     * 服务发现
     */
    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverport;

    @PostMapping("Payment/insert")
    public CommonResult insert(@RequestBody Payment payment) {
        int insert = paymentService.insert(payment);
        log.info("插入===========" + insert);
        if (insert > 0) {
            return new CommonResult(200, "插入成功"+serverport, insert);
        } else {
            return new CommonResult(444, "插入失败"+serverport);
        }
    }

    @GetMapping("Payment/{id}")
    public CommonResult<Payment> getOne(@PathVariable Long id) {
        Payment getOne = paymentService.getOne(id);
        log.info("查询===========" + getOne);
        if (getOne != null) {
            return new CommonResult(200, "查询成功"+serverport, getOne);
        } else {
            return new CommonResult(444, "查询失败"+serverport);
        }
    }

    /**
     * 服务发现
     */
    @GetMapping("payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("************service =="+service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri()+"\t");
        }
        return this.discoveryClient;

    }
}
