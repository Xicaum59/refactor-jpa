package com.Xicaum59.refactor.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Xicaum59.refactor.entities.User;
import com.Xicaum59.refactor.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Bonita", "maria@gmail.com", "41999999", "1234567");
		User u2 = new User(null, "Ze Mane", "mane@gmail.com", "41888888", "1234567");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
		}
		
	}


