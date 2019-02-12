package com.wangwei.springcloud.controller;

import java.util.List;

import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wangwei.springcloud.service.DeptService;
import com.wangwei.springcloud.entities.Dept;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController {

	 @Autowired
	  private DeptService service;



	  @RequestMapping(value="/dept/add",method=RequestMethod.POST)
	  public boolean add(@RequestBody Dept dept){
	   return service.add(dept);
	  }

	  

	  @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	  public Dept get(@PathVariable("id") Long id){
	   return service.get(id);
	  }

	  

	  @RequestMapping(value="/dept/list",method=RequestMethod.GET)
	  public List<Dept> list() {
	   return service.list();
	  }

	@RequestMapping(value = "/service1", method = RequestMethod.GET)
	public String service1() {
		return "Hello , 我是service1";

	}
	
}
