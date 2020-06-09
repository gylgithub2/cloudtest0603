package spring.cloud.account.dao;/*
@author gyl
@creat 2020-06-08-20:00:35
*/

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

@Mapper
public interface AccountDao {
    /**
     *  扣钱！！
     * @param userId
     * @param money
     */
    void decrease(@Param("userId") Long userId,@Param("money") BigDecimal money);
}
