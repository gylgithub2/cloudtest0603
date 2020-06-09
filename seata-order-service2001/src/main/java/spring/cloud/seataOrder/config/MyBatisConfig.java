package spring.cloud.seataOrder.config;/*
@author gyl
@creat 2020-06-08-18:06:49
*/

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value="spring.cloud.seataOrder.dao")
public class MyBatisConfig {
}
