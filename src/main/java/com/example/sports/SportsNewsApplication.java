package com.example.sports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SportsNewsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportsNewsApplication.class, args);
    }

}
