package com.wangwei.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRule {

    /*
    * 1.ribbon默认的负载均衡算法是轮询的
    * 2.如果想自定义实现ribbon的负载均衡算法，是需要在非@ComponentScan注解包下进行自定义
    * 3.ribbon有好几种负载均衡算法，比如轮询，随机，重试，。。。。
    *
    *
    * */
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

}
