package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] t1 = new String[10];
        String[] t2 = new String[10];

        int indT1 = 0;
        int indT2 = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o nome de 10 alunos");

        for (int i = 0; i < t1.length; i++) {
            String turma;
            do{
                System.out.println("Informe a turma do aluno: (T1 || T2)");
                turma = in.nextLine().toUpperCase();

            }while(!turma.equals("T1") && !turma.equals("T2"));

            System.out.println("Informe o nome do aluno: ");
            String nome = in.nextLine();

            switch (turma) {
                case "T1":
                    t1[indT1] = nome;
                    indT1++;
                    break;
                case "T2":
                    t2[indT2] = nome;
                    indT2++;
                    break;

            }

        }

        System.out.println("Nomes dos alunos da turma T1:");
        printarVetor(t1, indT1);


        System.out.println("\nNomes dos alunos da turma T2:");
        printarVetor(t2, indT2);
    }

    public static void printarVetor(String[] vetor, int indice){
        for (int i = 0; i < indice; i++){
            System.out.println(vetor[i]);
        }
    }
}