package com.uni.fiis.hha.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uni.fiis.hha.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping	
	public ResponseEntity<List<User>> findAll(){
		User hugo = new User("1", "Hugo HA", "Hugopit4@gmail.com");
		User enma = new User("2","Enma RO"," enmys1328@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(hugo,enma));
		return ResponseEntity.ok().body(list);
	}
}
