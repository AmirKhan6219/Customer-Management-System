package com.trantor.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.trantor")
@EnableAutoConfiguration
//@EntityScan("com.trantor.entity")
@EnableJpaRepositories

@SpringBootApplication
public class ProjectCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectCustomerApplication.class, args);
	}
}
