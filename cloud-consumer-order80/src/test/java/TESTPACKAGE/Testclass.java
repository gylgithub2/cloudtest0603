package TESTPACKAGE;/*
@author gyl
@creat 2020-06-05-9:21:48
*/

import lombok.SneakyThrows;

import java.util.concurrent.atomic.AtomicInteger;

public class Testclass {
    public static volatile Integer id = 0;
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger= new AtomicInteger();
    }


}
class   A2 extends Thread{
    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0;i<500;i++){
           Testclass.id++;
        }
    }
}
