package com.example.demo.model;

import javax.validation.constraints.NotBlank;

public class LoginCredentials {
	
	@NotBlank(message = "Please provide username")
	private String username;
	
	@NotBlank(message = "Please provide password")
	private String password;
	
	
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
	
	

}
