package org.example;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner leitorInteger = new Scanner(System.in);

        int[] conjunto = new int[10];
        int soma = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Digite um número inteiro:");
            conjunto[i] = leitorInteger.nextInt();
            soma += conjunto[i];
        }
        Integer media = (soma / conjunto.length);

        System.out.println(String.format("A média entre os 10 números digitados é: %.2f", media));

        System.out.println("Conjunto de números maior que a média: \n");
        for (int i: conjunto) {
            if(i > media){
                System.out.print("[" + i + "] ");
            }
        }


        //DESAFIO
        System.out.println("Exibindo a quantidade de valores impares: ");
        int somaImpares = 0;
        for (int i : conjunto){
            if((i % 2) != 0){
                somaImpares++;
            }
        }
        System.out.println(somaImpares);
    }
}
