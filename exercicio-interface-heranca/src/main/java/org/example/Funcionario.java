package org.example;

public abstract class Funcionario implements IBonus{
    private int codigo;
    private String nome;

    public Funcionario(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public abstract Double getGanho();
    @Override
    public Double getValorBonus(){return null;}

    @Override
    public String toString() {
        return "Funcionario{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
