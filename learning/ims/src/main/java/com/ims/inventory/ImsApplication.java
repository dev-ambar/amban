package com.ims.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImsApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(ImsApplication.class, args);
		System.out.println("helloWord");
	}
}
