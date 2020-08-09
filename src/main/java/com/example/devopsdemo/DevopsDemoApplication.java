package com.example.devopsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;
import java.util.Date;

@SpringBootApplication
public class DevopsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevopsDemoApplication.class, args);
    }
}

@RestController
class DemoController {
    @RequestMapping(path = "/test")
    public String test() throws Exception{
        return "Welcome DevOps! " + new Date() + " " + Inet4Address.getLocalHost().getHostName();
    }
}
