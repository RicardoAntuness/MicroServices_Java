package br.edu.atitus.currency_service.controllers;

import br.edu.atitus.currency_service.client.CurrencyBCClient;
import br.edu.atitus.currency_service.dto.CurrencyBCResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/currency")
public class CurrencyController {
    
    private final CurrencyBCClient currencyBCClient;

    public CurrencyController(CurrencyBCClient currencyBCClient) {
        this.currencyBCClient = currencyBCClient;
    }

    @GetMapping("/{moeda}")
    public ResponseEntity<Double> getCotacao(@PathVariable String moeda) {
        CurrencyBCResponse response = currencyBCClient.getCotacaoMoedaDia(moeda);
        if (response.getValue() != null && !response.getValue().isEmpty()) {
            return ResponseEntity.ok(response.getValue().get(0).getCotacaoVenda());
        }
        return ResponseEntity.notFound().build();
    }
}