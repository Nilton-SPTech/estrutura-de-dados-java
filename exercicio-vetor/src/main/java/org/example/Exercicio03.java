package org.example;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] conjunto = new String[10];
        int soma = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Digite uma palavra:");
            conjunto[i] = leitor.next();
        }


        System.out.println("Pesquise por uma palavra digitada:");
        String pesquisa = leitor.nextLine();

        boolean isPesqsuisa = false;
        int posicao = 0;
        for (int i = 0; i < conjunto.length; i++){
            if(conjunto[i].equals(pesquisa)){
                isPesqsuisa = true;
                posicao = i;
            }
        }

        System.out.println(isPesqsuisa ? "Nome encontrado no índice " + posicao + "."
                : "Nome não encontrado.");
    }
}
