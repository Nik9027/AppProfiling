package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProcessStarter {
	
	@Autowired
	SQSService conf;
	
	@PostConstruct
	public void startprocess() {
		//SQSConf conf= new SQSConf();
		System.out.println("Executing post method");
		System.out.println(conf.getname());
	}

}
