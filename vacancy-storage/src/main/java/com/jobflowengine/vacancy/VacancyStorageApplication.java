package com.jobflowengine.vacancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VacancyStorageApplication {
    public static void main(String[] args) {
        SpringApplication.run(VacancyStorageApplication.class, args);
    }
}
