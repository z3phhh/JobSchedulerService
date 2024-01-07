package com.jobflowengine.analytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserNotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserNotificationApplication.class, args);
    }
}
