package spring.cloud.account.controller;/*
@author gyl
@creat 2020-06-08-20:11:36
*/

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.account.dao.AccountDao;
import spring.cloud.account.domain.CommonResult;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class AccountController {
    @Resource
    AccountDao accountDao;
    @PostMapping(value="account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money) throws InterruptedException {
        log.info("account开始时扣钱1！！！等待10秒");
        TimeUnit.SECONDS.sleep(10);
        accountDao.decrease(userId,money);
        log.info("account扣钱结束！！！");
        return new CommonResult(200,"account减少钱。。。。");

    }
}
