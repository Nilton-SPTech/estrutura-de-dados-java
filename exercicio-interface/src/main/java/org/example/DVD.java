package org.example;

public class DVD extends Produto {
    private String nome;
    private String gravadora;

    public DVD(Integer codigo, Double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    @Override
    public Double getValorVenda() {
        return getValorVenda() + (getValorVenda() * .20);
    }

    @Override
    public String toString() {
        return "DVD {" +
                "nome='" + nome + '\'' +
                ", gravadora='" + gravadora + '\'' +
                ", valorVenda=" + getValorVenda() + '\'' +
                "} " + super.toString();
    }
}
