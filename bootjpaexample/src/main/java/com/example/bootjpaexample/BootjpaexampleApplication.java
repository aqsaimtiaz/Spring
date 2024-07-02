package com.example.bootjpaexample;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepo =  context.getBean(UserRepository.class);
		
		User user = new User();
		user.setId(2);
		user.setName("Aqsa");
		user.setCity("DXB");
		user.setStatus("Hello");
		
		userRepo.delete(user);
		userRepo.deleteById(5);
		
		Optional<User> updateuser  = userRepo.findById(2);
		// save is used for update as well
		
//		User user_ = userRepo.save(user);
	//	System.out.println(user_);
		
//		User user1 = new User();
//		user1.setName("Umair");
//		user1.setCity("DXB");
//		user1.setStatus("Hello");
//		
//		User user1_ = userRepo.save(user1);
//		System.out.println(user1_);
//		
//		User user2 = new User();
//		user2.setName("Muhammad");
//		user2.setCity("DXB");
//		user2.setStatus("Hello");
//		
//		User user2_ = userRepo.save(user2);
//		System.out.println(user2_);
		
		List<User> users = userRepo.findByName("Aqsa");
		users.forEach(p -> System.out.println(p.getId() + p.getName() + p.getCity() + p.getStatus()));
	}
	

}
