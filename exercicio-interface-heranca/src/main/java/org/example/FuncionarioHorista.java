package org.example;

public class FuncionarioHorista extends Funcionario {

    private int qtdHora;
    private Double valorHora;

    public FuncionarioHorista(int codigo, String nome, int qtdHora, Double valorHora) {
        super(codigo, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    @Override
    public Double getGanho() {
        return qtdHora * valorHora;
    }

    @Override
    public Double getValorBonus(){
        return (qtdHora * valorHora) * .10;
    }

    @Override
    public String toString() {
        return "FuncionarioHorista{" +
                "qtdHora=" + qtdHora +
                ", valorHora=" + valorHora +
                ", valorBonus=" + getValorBonus() +
                '}' + super.toString();
    }
}
