package cloud.spring.order.controller;/*
@author gyl
@creat 2020-06-06-21:29:41
*/

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController8005 {
    @Resource
    RestTemplate restTemplate;
    @Value("${server-url.nacos-user-service}")
    private String url2;
    @GetMapping("/order/payment")
    public String get22(){
        return restTemplate.getForObject(url2+"/payment",String.class);
    }
}
