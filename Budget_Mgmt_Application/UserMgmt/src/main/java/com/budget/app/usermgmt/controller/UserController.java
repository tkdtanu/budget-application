package com.budget.app.usermgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.budget.app.usermgmt.dto.UserDto;
import com.budget.app.usermgmt.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}


	@PostMapping
	public void createUser(@RequestBody UserDto userDto) {
		this.userService.createUser(userDto);
	}
	
	@GetMapping
	public List<UserDto> getAllUser(){
		return this.userService.retrieveAllUsers();
	}

}
