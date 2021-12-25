package com.dev.dto;

import java.io.Serializable;

import com.dev.domain.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String email;
	
	public UserDTO() {
		
	}
	
	public UserDTO(User user) {
		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
	}
}