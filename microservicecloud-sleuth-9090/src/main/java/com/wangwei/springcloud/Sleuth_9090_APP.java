package com.wangwei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class Sleuth_9090_APP {

    public static void main(String[] args) {
        SpringApplication.run(Sleuth_9090_APP.class,args);
    }
}
