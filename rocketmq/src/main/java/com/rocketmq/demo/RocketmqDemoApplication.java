package com.rocketmq.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RocketmqDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RocketmqDemoApplication.class, args);
    }
}
