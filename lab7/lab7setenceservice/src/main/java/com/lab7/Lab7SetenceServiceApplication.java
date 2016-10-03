package com.lab7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Lab7SetenceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab7SetenceServiceApplication.class, args);
	}
}
