package com.budget.app.usermgmt.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.budget.app.usermgmt.dto.UserDto;

@Entity
@Table(name = "user", catalog = "usermgmt")
public class User {
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "Id", columnDefinition = "BINARY(16)")
	private UUID id;
	
	@Column(name = "Name",nullable = false)
	private String name;
	
	@Column(name="Email", nullable = false, unique = true)
	private String email;
	
	@Column(name = "Password",nullable = false)
	private String password;
	
//	@PrePersist
	public void prePersist() {
		if(this.id == null) {
			this.id = UUID.randomUUID();
		}
	}
	
	public UserDto toDto() {
		final UserDto userDto = new UserDto();
		userDto.setEmail(getEmail());
		userDto.setName(getName());
		return userDto;
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
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
