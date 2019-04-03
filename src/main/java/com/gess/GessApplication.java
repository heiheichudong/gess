package com.gess;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gess.mapper")
public class GessApplication {

    public static void main(String[] args) {
        SpringApplication.run(GessApplication.class, args);
    }

}
