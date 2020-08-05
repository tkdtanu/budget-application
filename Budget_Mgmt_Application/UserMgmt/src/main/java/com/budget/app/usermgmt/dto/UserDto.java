package com.budget.app.usermgmt.dto;

import javax.validation.constraints.NotEmpty;

import com.budget.app.usermgmt.entity.User;

public class UserDto {
	
	@NotEmpty
	private String name;
	@NotEmpty
	private String email;
	@NotEmpty
	private String password;
	
	public User toEntity() {
		User user = new User();
		user.setEmail(getEmail());
		user.setName(getName());
		user.setPassword(getPassword());
		return user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
