package com.example.myeasydemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.example.myeasydemo.dao")
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class MyeasydemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyeasydemoApplication.class, args);
    }

}
