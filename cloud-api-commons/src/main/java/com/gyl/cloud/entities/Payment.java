package com.gyl.cloud.entities;/*
@author gyl
@creat 2020-06-03-16:23:24
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable{
    private  Long id;
    private  String serial;
}
