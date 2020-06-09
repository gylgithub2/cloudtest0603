package spring.cloud.seataOrder.service;/*
@author gyl
@creat 2020-06-08-16:55:54
*/

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.cloud.seataOrder.domain.CommonResult;

import java.math.BigDecimal;

@FeignClient("seata-account-service")
public interface AccountService {
    @PostMapping(value="account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money);
}
