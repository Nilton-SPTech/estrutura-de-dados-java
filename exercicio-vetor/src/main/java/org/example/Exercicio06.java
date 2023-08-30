package org.example;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] diaMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dia = 0;
        int mes = 0;
        int somaDias = 0;
        boolean isCorrect = false;

        while(!isCorrect){
            System.out.println("Digite um número de 1 a 31 - (Dia)");
            dia = leitor.nextInt();
            isCorrect = dia >= 1 && dia <= 12;

            if(!isCorrect){
                System.out.println("VALOR INVÁLIDO");
            }
        }

        isCorrect = false;
        while(!isCorrect){
            System.out.println("Digite um número de 1 a 12 - (Mês)");
            mes = leitor.nextInt();
            isCorrect = mes >= 1 && mes <= 12;

            if(!isCorrect){
                System.out.println("VALOR INVÁLIDO");
            }
        }

        for(int i = 0; i < (mes - 1) ; i++){
            somaDias += diaMes[i];
        }
        somaDias += dia;

        System.out.println(String.format(
                "O dia %d/%d corresponde ao dia %d do ano", dia, mes, somaDias));

    }
}
