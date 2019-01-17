package com.wangwei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //这个是开启springcloud-config配置中心
public class Config_3344_StartSpringCloudApp {

    //这个是如何进行测试3344的微服务的
    //http://config-3344.com:3344/application-test.yml
    public static void main(String[] args) {
        SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);
    }
}
