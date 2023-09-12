package org.example;

public class Acionista implements IBonus{
    private String acao;
    private int qtdAcoes;
    private Double precoAcao;

    public Acionista(String acao, int qtdAcoes, Double precoAcao) {
        this.acao = acao;
        this.qtdAcoes = qtdAcoes;
        this.precoAcao = precoAcao;
    }

    public Double getValorBonus(){
        return (qtdAcoes * precoAcao) * 0.20;
    }

    @Override
    public String toString() {
        return "Acionista{" +
                "acao='" + acao + '\'' +
                ", qtdAcoes=" + qtdAcoes +
                ", precoAcao=" + precoAcao +
                ", valorBonus=" + getValorBonus() +
                '}';
    }
}
