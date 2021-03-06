package com.dev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.domain.User;
import com.dev.dto.UserDTO;
import com.dev.repository.UserRepository;
import com.dev.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public User findById(String id) {
		Optional<User> user = repo.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
	}

	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User update(User obj) {
		User objAux = findById(obj.getId());
		updateData(objAux, obj);
		return repo.save(objAux);
	}

	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	private void updateData(User objAux, User obj) {
		objAux.setName(obj.getName());
		objAux.setEmail(obj.getEmail());		
	}
	
	public User fromDTO(UserDTO userDTO) {
		return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
	}
}