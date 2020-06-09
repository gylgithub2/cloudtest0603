package cloud.spring.order;/*
@author gyl
@creat 2020-06-06-21:27:05
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain8005 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain8005.class,args) ;
    }
}
