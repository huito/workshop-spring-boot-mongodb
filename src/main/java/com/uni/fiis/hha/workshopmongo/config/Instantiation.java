package com.uni.fiis.hha.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.uni.fiis.hha.workshopmongo.domain.User;
import com.uni.fiis.hha.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepo.deleteAll();		
		User hugo = new User(null, "Hugo HA", "Hugopit4@gmail.com");
		User enma = new User(null,"Enma RO", "Enmys1328@gmail.com");
		User gary = new User(null,"Gary AS", "Gary070203@gmail.com");
		//userRepo.save
		userRepo.saveAll(Arrays.asList(hugo,enma,gary));
	}
	
	

}
