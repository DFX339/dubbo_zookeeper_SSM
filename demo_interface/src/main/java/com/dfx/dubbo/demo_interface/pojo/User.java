package com.dfx.dubbo.demo_interface.pojo;

import java.io.Serializable;

/**
 * 实体类
 * @author Administrator
 *
 */
public class User implements Serializable{
	
	private int id;
	private String username;
	private String password;
	private int age;
	
	public User(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
