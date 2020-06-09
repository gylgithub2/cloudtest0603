package spring.gyl.coud;/*
@author gyl
@creat 2020-06-04-15:44:47
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsultMain7003 {
    public static void main(String[] args) {
        SpringApplication.run(ConsultMain7003.class,args);
    }
}
