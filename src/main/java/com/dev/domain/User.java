package com.dev.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document(collection = "users")
public class User implements Serializable{
	
	public static final long serialVersionUID = 1L;
	
	@EqualsAndHashCode.Include
	@Id
	private String id;
	private String name;
	private String email;
	
	public User() {
		
	}

	public User(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
}