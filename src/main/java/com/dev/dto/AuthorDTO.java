package com.dev.dto;

import java.io.Serializable;

import com.dev.domain.User;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class AuthorDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public AuthorDTO() {
		
	}
	
	public AuthorDTO(User user) {
		this.id = user.getId();
		this.name = user.getName();
	}
}