package com.pluto.homes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // springboot 어플리케이션 하위 계층만 컴포넌트 스캔
public class HomesApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomesApplication.class, args);
    }

}
