package org.example;

public class Alimento extends Produto {
    private Integer quantVitamina;

    public Alimento(Integer codigo, String descricao, Double preco, Integer quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }

    @Override
    public Double getValrorTributo() {
        return getPreco() * 0.15;
    }

    @Override
    public String toString() {
        return "Alimento {" +
                "quantVitamina=" + quantVitamina +
                "} " + super.toString();
    }

    public Integer getQuantVitamina() {
        return quantVitamina;
    }
}
