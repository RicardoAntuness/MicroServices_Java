package br.edu.atitus.currency_service.entities;

import java.util.List;

public class CurrencyResponse {
    private List<Currency> value;

    public List<Currency> getValue() {
        return value;
    }

    public void setValue(List<Currency> value) {
        this.value = value;
    }

    public static class Currency {
        private double cotacaoVenda;

        public double getCotacaoVenda() {
            return cotacaoVenda;
        }

        public void setCotacaoVenda(double cotacaoVenda) {
            this.cotacaoVenda = cotacaoVenda;
        }
    }
}
