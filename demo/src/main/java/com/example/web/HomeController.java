package com.example.web;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootConfiguration
@Controller
public class HomeController {
	@GetMapping("/")
	public String hello() {
		System.out.println("인지");
		return "index";
	}
	@GetMapping("/home")
	public String home() {
		return "user";
	}
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}

}