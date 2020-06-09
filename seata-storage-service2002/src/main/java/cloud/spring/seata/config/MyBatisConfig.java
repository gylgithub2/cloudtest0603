package cloud.spring.seata.config;/*
@author gyl
@creat 2020-06-08-18:06:49
*/

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value="cloud.spring.seata.dao")
public class MyBatisConfig {
}
