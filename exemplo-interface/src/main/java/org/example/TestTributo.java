package org.example;

public class TestTributo {
    public static void main(String[] args){
        Alimento a = new Alimento(1, "Banana", 200.0, 12);
        Perfume p = new Perfume(1, "Bom", 390.10, "Cheiroso");
        Servico s = new Servico("Trabalho", 12.90);

        Tributo t = new Tributo();
        t.adicionaTributavel(a);
        t.adicionaTributavel(p);
        t.adicionaTributavel(s);

        Double somaTributo = t.calculaTotalTributo();
        System.out.println("Soma de todos os tributos: " + somaTributo);
    }
}
