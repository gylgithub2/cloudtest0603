package spring.cloud.account.domain;/*
@author gyl
@creat 2020-06-08-19:57:51
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private  Long id;
    private  Long userId;
    //总额度
    private BigDecimal total;
    //已用额度
    private BigDecimal used;
    //剩余额度
    private BigDecimal residue;
}
