package com.lrh.cloud.config3344;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Config3344Application {

    public static void main(String[] args) {
        SpringApplication.run(Config3344Application.class, args);
    }

}
