package com.marsh.springflux;

import com.marsh.springflux.client.GreetingClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFluxApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringFluxApplication.class, args);
		GreetingClient greetingClient = context.getBean(GreetingClient.class);
		System.out.println(">> message = " + greetingClient.getMessage().block());
	}

}
