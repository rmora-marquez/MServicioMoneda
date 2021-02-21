package com.example.nameserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MServicioEurekaNamingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MServicioEurekaNamingApplication.class, args);
	}

}
