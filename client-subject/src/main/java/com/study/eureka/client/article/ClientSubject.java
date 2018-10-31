package com.study.eureka.client.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class ClientSubject {

    public static void main(String[] args){
        SpringApplication.run(ClientSubject.class, args);
    }

}
