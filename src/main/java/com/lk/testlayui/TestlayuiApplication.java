package com.lk.testlayui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lk.testlayui.mapper")
public class TestlayuiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestlayuiApplication.class, args);
    }

}
