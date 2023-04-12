package com.capgemini.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemandDraftController {
	
	//localhost:8080/index
	@RequestMapping("/index")
	public String showRegistrationPage() {
		return "demand_draft_registration";
	}
}
