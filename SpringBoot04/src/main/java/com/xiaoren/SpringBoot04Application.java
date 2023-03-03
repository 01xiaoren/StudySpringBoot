package com.xiaoren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan("com.example.map")@Mapper就不需要这里写了
public class SpringBoot04Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot04Application.class, args);
    }

}
