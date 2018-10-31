package com.study.eureka.client.adjective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class ClientAdjective {

    public static void main(String[] args){
        SpringApplication.run(ClientAdjective.class, args);
    }

}
