package com.budget.app.usermgmt.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.budget.app.usermgmt.dto.UserDto;
import com.budget.app.usermgmt.entity.User;
import com.budget.app.usermgmt.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;

	public UserService(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void createUser(final UserDto userDto) {
		if(userDto == null) {
			return;
		}
		userRepository.save(userDto.toEntity());
	}
	
	public List<UserDto> retrieveAllUsers(){
		return this.userRepository.findAll().stream().map(User::toDto).collect(Collectors.toList());
	}
	

}
