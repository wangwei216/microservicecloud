package com.wangwei.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
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
//    @Bean
//    public IRule myRule(){
//        return new RandomRule();
//    }
    @Bean
    public IRule myRule(){
        //这是一种如果当一个服务宕机了的话，ribbon会自动去进行尝试几次，如果连续失败的话，下一次他就不会再去进行访问了，
        // 如果都正常的话，他其实就是一种默认轮询的方式进行，只是多了一种尝试
        return new RetryRule();
    }

}
