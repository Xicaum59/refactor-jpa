package com.Xicaum59.refactor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Xicaum59.refactor.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
