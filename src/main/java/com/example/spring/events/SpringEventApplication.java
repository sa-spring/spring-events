package com.example.spring.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEventApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringEventApplication.class, args);
	}

	@Autowired
	private SomeEventSource source;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		this.source.fireEvent();

	}

}
