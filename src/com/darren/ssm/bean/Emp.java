package com.darren.ssm.bean;

/**
 * @author Administrator
 * 1,数据对象的封装
 */
public class Emp {
	private int eid;
	private String ename;
	private String sex;
	
	{
		System.out.println(eid);
	}
	
	static class MyThread extends Thread {
		
		public static void main(String[] args) {
			System.out.println("hhhh");
		}
	}
	
	
	public Emp(int eid, String ename, String sex) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
