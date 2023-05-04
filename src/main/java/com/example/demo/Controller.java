package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/check")
	private String data(){
		return "AWS CICD was sucessfully created\n hello";
		
	}
	     @GetMapping("check2")
	        public String data2() {
		return"AWS service using CICD created ;
	
	}
	        @GetMapping("check3")
	        public String data2() {
		return"pipeline run sucessfully";
			}
		
	}
