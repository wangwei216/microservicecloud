package com.wangwei.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wangwei.springcloud.service.DeptService;
import com.wangwei.springcloud.entities.Dept;

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



	  @RequestMapping(value = "/services2",method = RequestMethod.GET)
	  public String testServices2(){
	  	return "Hello,wangwei!";
	  }
}
