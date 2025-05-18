package br.edu.atitus.currency_service.dto;

import java.util.List;

public class CurrencyBCResponse {
    private List<CurrencyData> value;

    public List<CurrencyData> getValue() {
        return value;
    }

    public void setValue(List<CurrencyData> value) {
        this.value = value;
    }

    public static class CurrencyData {
        private double cotacaoVenda;

        public double getCotacaoVenda() {
            return cotacaoVenda;
        }

        public void setCotacaoVenda(double cotacaoVenda) {
            this.cotacaoVenda = cotacaoVenda;
        }
    }
}