package com.emonics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/hello")
	public String hello() {
		return "this is the opened hello path";
	}
	
	@GetMapping("/home")
	public String home() {
		return "this is home path";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "this is the admin path";
	}

}
