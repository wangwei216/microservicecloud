package com.wangwei.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.wangwei.springcloud.service.DeptService;
import com.wangwei.springcloud.entities.Dept;


@RestController
public class DeptController {

	@Autowired
	private DeptService service = null;


	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(@PathVariable("id") Long id){

		Dept dept =  this.service.get(id);
		if(null == dept) {
			throw new RuntimeException("该ID："+id+"没有没有对应的信息");
		}
		return dept;
	}

	/*
	* 熔断器其实就是当如果有一个服务被消费者调用的时候，如果出现异常的情况下，会自动调用@HystrixCommand注解下标标注好的fallbackMethod
	* 调用类汇总的方法进行一个处理。
	* 为了不影响整个系统的正常运行情况下，其实就是对进行报错的地方进行一个B计划处理的意思
	*
	* */
	public Dept processHystrix_Get(@PathVariable("id") Long id){
		Dept dept = new Dept();
		dept.setDeptno(id);
		dept.setDname("该ID："+id+"没有没有对应的信息,null--@HystrixCommand");
		dept.setDb_source("no this database in MySQL");
		return dept;
	}

}

