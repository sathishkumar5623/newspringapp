package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/check")
	private String data(){
		return "AWS CICD was sucessfully created\n hello";
		
	}
	     
		
	}
