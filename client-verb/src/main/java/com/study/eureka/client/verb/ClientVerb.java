package com.study.eureka.client.verb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class ClientVerb {

    public static void main(String[] args){
        SpringApplication.run(ClientVerb.class, args);
    }

}
