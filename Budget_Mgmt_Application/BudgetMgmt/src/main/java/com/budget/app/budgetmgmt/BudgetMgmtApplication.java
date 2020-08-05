package com.budget.app.budgetmgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.budget.app.budgetmgmt.client.UserMgmtClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(clients = {UserMgmtClient.class})
public class BudgetMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetMgmtApplication.class, args);
	}

}
