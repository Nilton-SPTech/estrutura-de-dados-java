package org.example;

public class Servico implements ITributavel{

    private String descricao;
    private Double preco;

    public Servico(String descricao, Double preco){
        this.descricao = descricao;
        this.preco = preco;
    }
    @Override
    public Double getValrorTributo() {
        return preco * .12;
    }

    @Override
    public String toString() {
        return "Servico {" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
