package com.iiht.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/home")
	public String homePage() {
		return "This is Home Page. Welcome to Digital Books Application";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "This is login Page";
	}
	
	@GetMapping("/history")
	public String purchaseHistory() {
		return "This is purchase history page for reader.";
	}
}
