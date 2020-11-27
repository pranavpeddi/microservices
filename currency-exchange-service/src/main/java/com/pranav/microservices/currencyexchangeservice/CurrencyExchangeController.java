package com.pranav.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	
	private Logger log=LoggerFactory.getLogger(this.getClass());
	
	
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository repo;
  
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to)
	{  
		int port=Integer.parseInt(environment.getProperty("local.server.port"));
		ExchangeValue exchangevalue=repo.findByFromAndTo(from, to);
		System.out.print(port);
		exchangevalue.setPort(port);
		log.info("{}",exchangevalue);
		return exchangevalue;
	}
}
