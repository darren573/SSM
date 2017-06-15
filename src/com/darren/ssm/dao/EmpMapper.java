package com.darren.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.darren.ssm.bean.Emp;
@Repository
public interface EmpMapper {
	/*
	 * 查询所有
	 */
	public List<Emp> queryAll();
	/*
	 * 添加员工
	 */
	public void addEmp(Emp emp);
}
