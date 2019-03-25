package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Value("${sqs.my.name}")
	String name;

	@RequestMapping("/")
	public String hello()
	{
		return "nikhil "+ name;
	}
}
