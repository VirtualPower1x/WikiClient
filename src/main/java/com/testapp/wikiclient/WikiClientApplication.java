package com.testapp.wikiclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WikiClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(WikiClientApplication.class, args);
    }

}
