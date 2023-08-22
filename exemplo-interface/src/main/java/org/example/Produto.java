package org.example;

public abstract class Produto implements ITributavel{

    private Integer codigo;
    private String descricao;
    private Double preco;

    public Produto(Integer codigo, String descricao, Double preco){
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public Double getValrorTributo() {
        return null;
    }

    @Override
    public String toString() {
        return "Produto {" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
    public Double getPreco() {
        return preco;
    }
}
