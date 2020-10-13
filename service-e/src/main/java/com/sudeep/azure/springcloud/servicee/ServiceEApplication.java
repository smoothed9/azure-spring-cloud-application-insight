package com.sudeep.azure.springcloud.servicee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceEApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEApplication.class, args);
	}

}
