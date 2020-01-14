package com.vinay.currencyexchangeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.currencyexchangeservice.bean.ExchageValue;

@RestController
public class CurrencyExchangeController {

	@GetMapping("/currency-exhange/{from}/to/{to}")
	public ExchageValue retreiveExchangeValue(@PathVariable String from,@PathVariable String to) {
		
		return new ExchageValue(1000L, from,to,65l);
	}
}
