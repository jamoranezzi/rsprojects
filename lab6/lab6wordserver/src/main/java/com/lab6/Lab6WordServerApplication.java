package com.lab6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab6WordServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab6WordServerApplication.class, args);
	}
}
