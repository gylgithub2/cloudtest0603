package cloud.spring.privide.controller;/*
@author gyl
@creat 2020-06-03-17:14:48
*/


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;



@RestController
public class NacosController {
    @Value("${server.port}")
    private String serverport;
    @GetMapping("payment")
    public String getOne() {
        return "====================TOT============="+serverport;

    }
}
