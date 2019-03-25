package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class SQSService {

	@Value("${sqs.my.name}")
	String name;
	
	@Value("${mode}")
	String mode;
	
	public String getname() {
		return name+" "+mode;
	}
}
