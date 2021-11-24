package com.persistent;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Welcome to Jenkins Demo Application Started");

	}

	public static void main(String[] args) {
		logger.info("application Executed sucessfully");
		
		SpringApplication.run(SpringJenkinsApplication.class, args);
		System.out.println("----Welcome----");
	}

}
