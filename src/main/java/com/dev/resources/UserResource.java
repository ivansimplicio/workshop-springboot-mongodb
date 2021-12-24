package com.dev.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping()
	public ResponseEntity<List<User>> findAll(){
		User user = new User("1", "José", "jose@email.com");
		User user2 = new User("2", "Maria", "maria@email.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(user, user2));
		return ResponseEntity.ok().body(list);
	}
}