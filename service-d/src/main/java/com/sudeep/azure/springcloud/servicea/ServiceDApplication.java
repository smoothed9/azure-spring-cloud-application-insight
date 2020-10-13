package com.sudeep.azure.springcloud.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceDApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDApplication.class, args);
	}

}
