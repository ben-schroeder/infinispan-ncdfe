package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ADemoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder().sources(ADemoApplication.class).run(args);
	}

}

