package cloud.spring.seata.service.impl;/*
@author gyl
@creat 2020-06-08-19:22:38
*/

import cloud.spring.seata.dao.StorageDao;
import cloud.spring.seata.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class StorageServiceimpl implements StorageService {
    @Resource
    StorageDao storageDao;
    public void decrease(@Param("productId") Long productId, @Param("count") Integer count){

        log.info("storageservice ===开始减库存。。");
        storageDao.decrease(productId,count);
    }
}
