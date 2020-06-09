package spring.cloud.account.config;/*
@author gyl
@creat 2020-06-08-20:04:59
*/

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value="spring.cloud.account.dao")
public class MybatisConfig {
}
