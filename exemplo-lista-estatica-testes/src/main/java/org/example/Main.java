package org.example;

public class Main {
    public static void main(String[] args) {
        ListaEstatica list = new ListaEstatica(5);

        list.adiciona(1);
        list.adiciona(30);
        list.adiciona(40);
        list.adiciona(110);
        list.adiciona(11120);

        list.removePeloIndice(3);

        list.exibe();
    }
}