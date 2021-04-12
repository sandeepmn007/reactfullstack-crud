package com.java.fullstackcrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

	
	@GetMapping("/")
	public String getHome() {
		return "This is Rest Controller";
	}
}
