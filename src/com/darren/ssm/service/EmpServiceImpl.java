package com.darren.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.darren.ssm.bean.Emp;
import com.darren.ssm.dao.EmpMapper;
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpMapper empMapper;
	@Override
	public List<Emp> queryAll() {
		// TODO Auto-generated method stub
		return empMapper.queryAll();
	}

	@Override
	public void addEmp(Emp emp) {
		// TODO Auto-generated method stub
		empMapper.addEmp(emp);
	}
}
