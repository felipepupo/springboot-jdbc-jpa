package com.example.springbootjdbcjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.springbootjdbcjpa.jdbc.PersonJdbcDao;

@SpringBootApplication
public class SpringbootJdbcJpaApplication {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;

	@Bean
	public CommandLineRunner commandLineRunnerBean() {
		return (args) -> {
			logger.info("All users -> {}", dao.findAll());
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbcJpaApplication.class, args);
	}
}