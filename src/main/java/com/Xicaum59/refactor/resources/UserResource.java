package com.Xicaum59.refactor.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Xicaum59.refactor.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		
		
		User u = new User(1L, "Mario", "mariaum@gamil.com", "4199999999", "657657657");
			return ResponseEntity.ok().body(u);
		
	}
	
}
