package com.ty;

public class Student {
	private int age;
	private String name;
	private int reg_no;

	public Student(int age, String name, int reg_no) {
		this.age = age;
		this.name = name;
		this.reg_no = reg_no;
	}

	public Student() {

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReg_no() {
		return reg_no;
	}

	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}

}
