package org.example;

public class FuncionarioHoraExtra extends Funcionario{
    private Double salario;
    private int qtdHoraExtra;
    private Double valorHoraExtra;

    public FuncionarioHoraExtra(int codigo, String nome, Double salario, int qtdHoraExtra, Double valorHoraExtra) {
        super(codigo, nome);
        this.salario = salario;
        this.qtdHoraExtra = qtdHoraExtra;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public Double getGanho() {
        return salario + (qtdHoraExtra * valorHoraExtra);
    }

    @Override
    public Double getValorBonus(){
        return (salario + (qtdHoraExtra * valorHoraExtra)) * .15;
    }

    @Override
    public String toString() {
        return "FuncionarioHoraExtra{" +
                "salario=" + salario +
                ", qtdHoraExtra=" + qtdHoraExtra +
                ", valorHoraExtra=" + valorHoraExtra +
                ", valorBonus=" + getValorBonus() +
                '}' + super.toString();
    }
}
