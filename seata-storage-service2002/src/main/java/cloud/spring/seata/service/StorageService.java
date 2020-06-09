package cloud.spring.seata.service;/*
@author gyl
@creat 2020-06-08-19:22:05
*/


import org.apache.ibatis.annotations.Param;

public interface StorageService {
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
