package com.darren.ssm.bean;
/**
 * @author Administrator
 * 数据响应的封装 DTO
 */
public class Result<T> {
	private int code;
	private String msg;
	private T result;
	
	public Result(int code, String msg, T result) {
		super();
		this.code = code;
		this.msg = msg;
		this.result = result;
	}
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	
}
