package cloud.spring.seata.controller;/*
@author gyl
@creat 2020-06-08-19:39:42
*/

import cloud.spring.seata.domain.CommonResult;
import cloud.spring.seata.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StorageController {
    @Autowired
    StorageService storageService;
    @PostMapping("storage/decrease")
    CommonResult decreate(@RequestParam("proDuctId") Long id, @RequestParam("count") Integer count){
        log.info("storage==开始减库存");

        storageService.decrease(id,count);
        log.info("storage==完成减库存");
        return new CommonResult(200,"storage完成减库存！！！！");

    }
}
