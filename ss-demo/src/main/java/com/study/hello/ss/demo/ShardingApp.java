package com.study.hello.ss.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: fangxiangqian
 * @Date: 2023/5/28
 */
@SpringBootApplication
@MapperScan("com.study.hello.ss.demo.mapper")
public class ShardingApp {
    public static void main(String[] args) {
       SpringApplication.run(ShardingApp.class, args);
    }
}