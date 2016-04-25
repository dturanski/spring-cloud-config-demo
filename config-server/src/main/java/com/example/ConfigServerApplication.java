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

//    @Bean
//    PropertyPathNotificationExtractor propertyPathNotificationExtractor() {
//        return new PropertyPathNotificationExtractor() {
//            @Override public PropertyPathNotification extract(
//                    MultiValueMap<String, String> headers, Map<String, Object> payload) {
//                logger.info(headers.toString());
//                logger.info(payload.toString());
//                return null;
//            }
//        };
//    }
}

