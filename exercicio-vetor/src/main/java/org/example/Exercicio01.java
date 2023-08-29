package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leitorInteger = new Scanner(System.in);

        int[] conjunto = new int[7];

        for (int i = 0; i < 7; i++){
            System.out.println("Digite um número inteiro:");
            conjunto[i] = leitorInteger.nextInt();
        }

        System.out.println("Você inseriu os seguintes números: \n");
        for (int i : conjunto){
            System.out.print("[" + i + "]");
        }

        System.out.println("Você inseriu os seguintes números: \n");
        for (int i = (conjunto.length - 1); i >= 0; i--){
            System.out.print("[" + conjunto[i] + "]");
        }

        // DESAFIO 01
        System.out.println("Soma dos valores: ");
        int soma = 0;
        for (int i: conjunto) {
            soma += i;
        }
        System.out.println(soma);
    }
}
