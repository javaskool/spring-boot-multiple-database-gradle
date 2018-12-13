package com.javaskool.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.javaskool")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpringBootMultipleDatabaseGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultipleDatabaseGradleApplication.class, args);
	}
}
