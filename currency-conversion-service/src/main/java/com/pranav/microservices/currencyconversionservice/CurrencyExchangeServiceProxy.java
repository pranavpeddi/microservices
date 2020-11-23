package com.pranav.microservices.currencyconversionservice;

import java.math.BigDecimal;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name ="currency-exchange-service",url="localhost:8000")
@RibbonClient(name="currency-exchange-service")
@FeignClient(name="netflix-zuul-api-gateway-server")

public interface CurrencyExchangeServiceProxy {
	
	
	//@GetMapping("/currency-exchange/from/{from}/to/{to}")
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean converter(@PathVariable("from") String from,
			@PathVariable("to") String to);

}
