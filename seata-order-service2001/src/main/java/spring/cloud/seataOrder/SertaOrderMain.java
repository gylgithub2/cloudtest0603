package spring.cloud.seataOrder;/*
@author gyl
@creat 2020-06-08-16:26:03
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
/**
 * 去掉数据源的默认代理，使用seata自己的数据源
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SertaOrderMain {
    public static void main(String[] args) {
        SpringApplication.run(SertaOrderMain.class,args);
    }
}
