package com.example.demo.form;

public class LoginForm {

	private String name;
	private String password;
	
	@Override
	public String toString() {
		return "LoginForm [name=" + name + ", password=" + password + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
