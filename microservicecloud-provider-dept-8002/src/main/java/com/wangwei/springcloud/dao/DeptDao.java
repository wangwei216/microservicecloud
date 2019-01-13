package com.wangwei.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wangwei.springcould.entities.Dept;
import org.springframework.stereotype.Repository;

@Mapper
public interface DeptDao {
	
	  public boolean addDept(Dept dept);

	  public Dept findById(Long id);

	  public List<Dept> findAll();
	  
}
