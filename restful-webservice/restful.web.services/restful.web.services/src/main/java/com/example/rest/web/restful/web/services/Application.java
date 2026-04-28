package com.example.rest.web.restful.web.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = {
	    "com.example.rest.web.restful.web.services",
	    "versioning"   // add your versioning package here
	})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Hello World");
	}

}
