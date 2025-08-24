package com.lb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LbApplication {

	public static void main(String[] args) {
		SpringApplication.run(LbApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(String[] args){
		return runner -> {
			System.out.println("Note: This statement runs after all the spring beans get loaded");
			System.out.println("Started LB application");
		};
	}
}
