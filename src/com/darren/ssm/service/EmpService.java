package com.darren.ssm.service;

import java.util.List;

import com.darren.ssm.bean.Emp;

public interface EmpService {
	/*
	 * 查询所有
	 */
	public List<Emp> queryAll();
	/*
	 * 添加员工
	 */
	public void addEmp(Emp emp);
}
