package com.budget.app.budgetmgmt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BudgetsController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello!!!!!!!!!!!";
	}
	

}
