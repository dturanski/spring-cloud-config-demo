package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    Logger logger = LoggerFactory.getLogger(ConfigServerApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}

