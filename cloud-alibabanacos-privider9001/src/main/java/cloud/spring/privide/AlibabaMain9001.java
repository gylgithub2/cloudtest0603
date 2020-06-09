package cloud.spring.privide;/*
@author gyl
@creat 2020-06-06-20:51:58
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaMain9001.class, args);
    }
}