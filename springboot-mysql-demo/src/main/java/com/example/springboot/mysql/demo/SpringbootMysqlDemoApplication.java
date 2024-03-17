package com.example.springboot.mysql.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.springboot.mysql.demo.dao") // 指定Mapper接口所在的包
@SpringBootApplication
public class SpringbootMysqlDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMysqlDemoApplication.class, args);
    }

}
