package com.example.mqdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mqdemo.mapper")
public class MqdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqdemoApplication.class, args);
    }

}
