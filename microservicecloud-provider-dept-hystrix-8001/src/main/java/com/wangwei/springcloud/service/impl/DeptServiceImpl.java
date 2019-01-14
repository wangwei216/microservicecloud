package com.wangwei.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangwei.springcloud.dao.DeptDao;
import com.wangwei.springcloud.service.DeptService;
import com.wangwei.springcloud.entities.Dept;

@Service
public class DeptServiceImpl  implements DeptService{

	@Autowired
	private DeptDao deptDao;
	
	@Override
	public boolean add(Dept dept) {
		
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> list() {
		
		return deptDao.findAll();
	}

}
