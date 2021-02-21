package com.example.msmoneda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.msmoneda.feign")
@EnableDiscoveryClient
public class MServicioCasaCambioApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MServicioCasaCambioApplication.class);
		//SpringApplication.run(MServicioCasaCambioApplication.class, args);
		app.run(args);
	}

}
