package spring.cloud.seataOrder.service;/*
@author gyl
@creat 2020-06-08-16:55:32
*/

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import spring.cloud.seataOrder.domain.CommonResult;

@FeignClient(value="seata-storage-service")
public interface StorageService {
    @PostMapping("storage/decrease")
    CommonResult decreate(@RequestParam("proDuctId") Long id,@RequestParam("count") Integer count);
}
