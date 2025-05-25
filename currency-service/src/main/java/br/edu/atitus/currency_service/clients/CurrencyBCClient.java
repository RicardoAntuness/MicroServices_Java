package br.edu.atitus.currency_service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

<<<<<<< HEAD
@FeignClient(name = "CurrencyBCClient", 
		url = "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata")
public interface CurrencyBCClient {
	
	@GetMapping("/CotacaoMoedaDia(moeda=@moeda,dataCotacao=@dataCotacao)?@moeda='{moeda}'&@dataCotacao='05-21-2025'&$format=json")
=======
@FeignClient(
		name = "CurrencyBCClient", 
		url = "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata",
		fallback = CurrencyBCFallback.class)
public interface CurrencyBCClient {

	@GetMapping("/CotacaoMoedaDia(moeda=@moeda,dataCotacao=@dataCotacao)?@moeda='{moeda}'&@dataCotacao='05-22-2025'&$format=json")
>>>>>>> 7817356 (currency)
	CurrencyBCResponse getCurrency(@PathVariable String moeda);

}
