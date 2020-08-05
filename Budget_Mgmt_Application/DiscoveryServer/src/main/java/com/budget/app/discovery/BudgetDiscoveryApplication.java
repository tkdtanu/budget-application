package com.budget.app.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BudgetDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetDiscoveryApplication.class, args);
	}

}
