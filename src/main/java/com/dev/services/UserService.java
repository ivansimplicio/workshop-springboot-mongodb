package com.dev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.domain.User;
import com.dev.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll(){
		return repo.findAll();
	}
}