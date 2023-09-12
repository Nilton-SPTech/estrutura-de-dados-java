package org.example;

public class Main {
    public static void main(String[] args) {
        FuncionarioHorista f01 = new FuncionarioHorista(1, "Allan", 20, 90.0);
        FuncionarioHorista f02 = new FuncionarioHorista(2, "José", 10, 95.0);

        FuncionarioHoraExtra f03 = new FuncionarioHoraExtra(2, "Renan", 1000.0, 15, 25.0);
        Acionista a01 = new Acionista("Compra Amazon", 120, 12.0);

        ControleBonus controleBonus = new ControleBonus();

        controleBonus.adicionarBonus(f01);
        controleBonus.adicionarBonus(f02);
        controleBonus.adicionarBonus(f03);
        controleBonus.adicionarBonus(a01);

        controleBonus.listarBonus();
        Double bonusTotal = controleBonus.calcularGastoBonus();

        System.out.println("Valor total bonus: " + bonusTotal);
    }
}