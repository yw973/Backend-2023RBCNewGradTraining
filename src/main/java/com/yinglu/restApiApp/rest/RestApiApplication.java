package com.yinglu.restApiApp.rest;

import com.yinglu.restApiApp.rest.Models.User;
import com.yinglu.restApiApp.rest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@Autowired
	private UserRepo userRepo;

	@Override
	public void run(String... args) throws Exception{
//		this.userRepo.save(new User("Yinglu", "Wang", 1L,0,"student"));
//		this.userRepo.save(new User("Hong", "Wang", 2L,30,"Developer"));
//		this.userRepo.save(new User("Yu", "Wang", 3L,60,"Professor"));


	}


}
