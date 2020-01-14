package com.vinay.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.microservices.limitsservice.bean.LimitConfiguration;
import com.vinay.microservices.limitsservice.config.Configuration;

@RestController
public class LimitController {

	@Autowired Configuration config;
	
	@GetMapping( "/limits")
	public LimitConfiguration getLimits(){
		
		return new LimitConfiguration(config.getMinimum(),config.getMaximum());
	}
}
