package br.edu.atitus.product_service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@FeignClient(
	    name = "currency-service", 
	    url = "http://localhost:8100",
	    fallback = CurrencyFallback.class
	)
	public interface CurrencyClient {

	    @GetMapping("/currency/{value}/{source}/{target}")
	    CurrencyResponse getCurrency(
	        @PathVariable double value,
	        @PathVariable String source,
	        @PathVariable String target
	    );
	}
