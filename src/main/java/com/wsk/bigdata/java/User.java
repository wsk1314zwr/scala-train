package com.wsk.bigdata.java;

public class User {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat(){
		System.out.println(this.name+"吃饭");
	}

	public User() {




	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
