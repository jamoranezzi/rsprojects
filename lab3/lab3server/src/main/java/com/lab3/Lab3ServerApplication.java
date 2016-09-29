package com.lab3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Lab3ServerApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Lab3ServerApplication.class, args);
	}

	/**
	 * Si se realiza como WAR en un Tomcat el puerto que predomina es el del TOMCAT default: 8080
	 * */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Lab3ServerApplication.class);
	}
}
