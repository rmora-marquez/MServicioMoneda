package com.example.msmoneda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MServicioCasaCambioApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MServicioCasaCambioApplication.class);
		//SpringApplication.run(MServicioCasaCambioApplication.class, args);
		app.run(args);
	}

}
