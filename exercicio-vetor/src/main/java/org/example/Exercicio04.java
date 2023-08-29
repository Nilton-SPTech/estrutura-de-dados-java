package org.example;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitorInteger = new Scanner(System.in);

        int[] conjunto = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Digite um número inteiro:");
            conjunto[i] = leitorInteger.nextInt();
        }

        System.out.println("Informe um número para a pesquisa:");
        Integer numeroDigitado = leitorInteger.nextInt();

        int qntVezes = 0;
        for (int i : conjunto) {
            if(numeroDigitado.equals(i)){
                qntVezes++;
            }
        }

        System.out.println(String.format("O número %d ocorre %d vezes", numeroDigitado, qntVezes));
    }
}
