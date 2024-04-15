package com.rishu.user2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/user2")
	public String getData()
	{
		return "Hello Yashwant";
	}
	
	@GetMapping("/")
	public String getData1()
	{
		return "Healthy";
	}

}
