package com.lab5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab5SenteceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab5SenteceServiceApplication.class, args);
	}
}
