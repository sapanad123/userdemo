package com.velocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class UserMicroserviceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMicroserviceDemoApplication.class, args);
	}

	// we are creating the instance of webclient
	@Bean
	public WebClient webClient() {
		return WebClient.builder().build();
	}

}
