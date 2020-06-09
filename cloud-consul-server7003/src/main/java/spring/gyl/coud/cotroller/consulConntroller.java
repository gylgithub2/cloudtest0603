package spring.gyl.coud.cotroller;/*
@author gyl
@creat 2020-06-04-15:48:07
*/

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class consulConntroller {

    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/consul")
    public  String ggg(){
        return "****consul"+serverPort;
    }
}
