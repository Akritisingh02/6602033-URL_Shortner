package com.example.ShortnerKing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ShortnerKingApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ShortnerKingApplication.class)
		.properties("server.port=8082")
        .run(args);
	}

}
