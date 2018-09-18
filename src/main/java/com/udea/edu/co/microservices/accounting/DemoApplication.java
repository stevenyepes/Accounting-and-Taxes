package com.udea.edu.co.microservices.accounting;

import com.udea.edu.co.microservices.accounting.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		User user = new User();
		user.setEmail("hey");
        System.out.println(user.getEmail());
	}
}
