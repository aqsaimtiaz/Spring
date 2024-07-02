package com.example.bootjpaexample;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{

	List<User> findByName(String name);
	// Find: Introducer
	// ByName: Criteria 
}
