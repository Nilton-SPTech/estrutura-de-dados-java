package org.example;

public abstract  class Produto implements IVendavel{
    private Integer codigo;
    private Double precoCusto;

    public Produto(Integer codigo, Double precoCusto) {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }

    @Override
    public Double getValorVenda() {
        return null;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", precoCusto=" + precoCusto +
                '}';
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }
}
