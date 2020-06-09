package cloud.spring.seata.dao;/*
@author gyl
@creat 2020-06-08-19:21:55
*/

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageDao {

    void decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
