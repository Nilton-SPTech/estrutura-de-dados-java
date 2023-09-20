package org.example;

public class Main {
    public static void main(String[] args) {
        ListaEstatica list = new ListaEstatica(7);

        list.adiciona(1);
        list.adiciona(30);
        list.adiciona(40);
        list.adiciona(100);
        list.adiciona(100);
        list.adiciona(100);


        list.adicionaNoInicio(2000);
        list.exibe();
    }
}