package org.example;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int tamanho = 5;
        String[] vetorCarro = new String[tamanho];
        int[] vetorRendimento = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.println("Digite o nome do carro: ");
            vetorCarro[i] = leitor.nextLine();
        }

        int posicaoRendimento = 0;
        int maiorRendimento = 0;
        for (int i = 0; i < tamanho; i ++){
            System.out.println("Digite o RENDIMENTO do carro: " + vetorCarro[i]);
            vetorRendimento[i] = leitor.nextInt();

            if(vetorRendimento[i] > maiorRendimento){
                posicaoRendimento = i;
                maiorRendimento = vetorRendimento[i];
            }
        }

        System.out.println("Modelo e rendimento dos carros. (Com * representa o carro com maior rendimento)");
        for(int i = 0; i < tamanho; i++){
            if (i == posicaoRendimento){
                System.out.println("** " + vetorCarro[i] + " - " + vetorRendimento + "l");
            }
            System.out.println(vetorCarro[i] + " - " + vetorRendimento[i] + "l");
        }
    }
}
