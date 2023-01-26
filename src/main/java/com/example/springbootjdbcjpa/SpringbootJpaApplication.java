package com.example.springbootjdbcjpa;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.springbootjdbcjpa.entity.Person;
import com.example.springbootjdbcjpa.jpa.PersonJpaRepository;

@SpringBootApplication
public class SpringbootJpaApplication {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;

	@Bean
	public CommandLineRunner commandLineRunnerBean() {
		return (args) -> {
			logger.info("User id 10001 -> {}", repository.findById(10001));
		
			logger.info("Inserting -> {}", 
					repository.insert(new Person("Tara", "Berlin", new Date())));
			
			logger.info("Update 10003 -> {}", 
					repository.update(new Person(10003, "Pieter", "Utrecht", new Date())));
			
			repository.deleteById(10002);

			logger.info("All users -> {}", repository.findAll());
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}
}