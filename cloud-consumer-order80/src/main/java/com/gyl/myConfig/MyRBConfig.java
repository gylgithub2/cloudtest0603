package com.gyl.myConfig;/*
@author gyl
@creat 2020-06-04-18:42:39
*/

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRBConfig {
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
