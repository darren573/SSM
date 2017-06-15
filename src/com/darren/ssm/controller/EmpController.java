package com.darren.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.darren.ssm.bean.Emp;
import com.darren.ssm.bean.Result;
import com.darren.ssm.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpService empService;
	@RequestMapping("/queryAll.do")
	public @ResponseBody Result<List<Emp>> queryAll() {
		// TODO Auto-generated method stub
		List<Emp> list =empService.queryAll();
		Result<List<Emp>> result =new Result<>();
		result.setCode(200);
		result.setMsg("请求成功");
		result.setResult(list);
		return result;
	}
	@RequestMapping("/addEmp.do")
	public void addEmp(Emp emp) {
		// TODO Auto-generated method stub
		empService.addEmp(emp);
	}
	
}
