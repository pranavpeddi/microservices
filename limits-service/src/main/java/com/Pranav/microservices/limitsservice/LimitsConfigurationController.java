package com.Pranav.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Pranav.microservices.limitsservice.Bean.LimitsConfiguration;


@RestController
public class LimitsConfigurationController {

	
	
	
	@Autowired
	private Configuration configuration;
	
	
	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsFromConfiguration()
	{
		LimitsConfiguration limitConfiguration=new LimitsConfiguration(
				configuration.getMaximum(),configuration.getMinimum());
				return limitConfiguration;
	}
	
	
	
	
	public LimitsConfiguration something()
	{
		return new LimitsConfiguration(1000,10);
	}
}
