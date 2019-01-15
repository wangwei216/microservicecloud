package com.wangwei.springcloud.services;

import com.wangwei.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    /*
    * 这里其实就相当于把之前服务熔断中，对一些错误的异常执行B计划的时候的方法都给抽象出来，使用的就是AOP的思想
    * 好处就是：
    *   1.不用在每一个业务的方法头上都加一个方法，减少耦合
    *   2.还可以让代码更加的复用
    *
    * */
    @Override
    public DeptClientService create(Throwable throwable) {
        //这里就是直接返回DeptClientService对象，然后
        return new DeptClientService() {
            //这里先只写一个熔断处理的
            @Override
            public Dept get(long id) {
                Dept dept = new Dept();
                dept.setDeptno(id);
                dept.setDname("该ID："+id+"没有没有对应的信息,null--@HystrixCommand");
                dept.setDb_source("我是Hystrix的服务降级测试------->no this database in MySQL");
                return dept;
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
