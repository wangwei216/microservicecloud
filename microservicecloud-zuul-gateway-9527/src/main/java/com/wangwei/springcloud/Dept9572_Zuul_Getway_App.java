package com.wangwei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Dept9572_Zuul_Getway_App {

    public static void main(String[] args) {
        SpringApplication.run(Dept9572_Zuul_Getway_App.class,args);
    }
}
