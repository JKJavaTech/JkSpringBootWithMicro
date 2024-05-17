package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {
	
	@GetMapping("/firstData")
	public String getData() {
		return "<h1>Welcome To MyFirstSpringBootApp</h1>";
	}
	

}
