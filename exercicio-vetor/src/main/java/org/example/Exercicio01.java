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
        for (int i = conjunto.length; i > 0; i--){
            System.out.print("[" + conjunto[i] + "]");
        }
    }
}
