package br.edu.atitus.currency_service.client;

import br.edu.atitus.currency_service.entities.CurrencyResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
	    name = "bancoCentralClient", 
	    url = "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata"
	)
	public interface CurrencyBCClient {
	    
	    @GetMapping("/CotacaoMoedaDia(moeda=@moeda,dataCotacao=@dataCotacao)?@moeda='{moeda}'&@dataCotacao='{dataCotacao}'&$format=json")
	    CurrencyResponse getCotacaoMoedaDia(
	        @PathVariable("moeda") String moeda,
	        @PathVariable("dataCotacao") String dataCotacao
	    );
	}