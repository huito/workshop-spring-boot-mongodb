package com.uni.fiis.hha.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.fiis.hha.workshopmongo.domain.User;
import com.uni.fiis.hha.workshopmongo.repository.UserRepository;
import com.uni.fiis.hha.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public List<User> findAll(){
		return userRepo.findAll();
	}
	
	public User findById(String id) {
		User user = userRepo.findById(id).orElse(null);
		if(user==null) {
			throw new ObjectNotFoundException("Objecto no encontrado");
		}
		return user;
	}
	
	

}
