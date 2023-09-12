package org.example;

import java.util.Arrays;

public class SelectionSort {
    //DESSA FORMA ELE TROCA DE LUGAR TODA A VEZ QUE O VALOR FOR MENOR
    //JEITO RUIM
    public static void selectionSort(int[] v){
        //REPRESENTA A QUANTIDE DE VEZES QUE ENTROU NO i
        int comparacao = 0;

        //REPRESENTA A QUANTIDADE DE VEZES QUE ENTROU NO j
        int troca = 0;

        //PERCORRE O VETOR
        for (int i = 0; i < v.length -1; i++){
            comparacao++;

            //PERCORRE O VETOR E COMPARA OS VALORES
            for (int j = i + 1; j < v.length; j++){
                troca++;
                if (v[j] < v[i]){
                    //GUARDA O VALOR QUE ESTÁ NA POSIÇÃO j
                    int aux = v[i];

                    //GUARDAR O VALOR DE v[j] NA POSIÇÃO v[i]
                    v[i] = v[j];

                    //GUARDAR O VALOR AUXILIAR NA POSIÇÃO v[j]
                    v[j] = aux;
                }
            }

            //APRESENTANDO A QUANTIDADE DE COMPARAÇÕES E TROCAS
            System.out.print("Comparações e trocas: v[" + i + "] / ");
            System.out.println("c = " + comparacao + "/ t = " + troca);
        }
        System.out.println(Arrays.toString(v));
        System.out.println("c = " + comparacao + "/ t = " + troca);
    }

    //DESSA FORMA ELE NÃO TROCA A TODO MOMENTO
    //JEITO CERTO
    public static void selectionSortOtimizado(int[] v){
        int comparacao = 0;
        int troca = 0;

        for(int i = 0; i < v.length -1; i++){
            int indMenor = i;
            comparacao++;
            for (int j = i + 1; j < v.length; j++){
                troca++;
                indMenor = v[j] < v[indMenor] ? j : indMenor;
            }
            int aux = v[i];
            v[i] = v[indMenor];
            v[indMenor] = aux;

            System.out.print("Comparações e trocas: v[" + i + "] / ");
            System.out.println("c = " + comparacao + "/ t = " + troca);
        }
        System.out.println(Arrays.toString(v));
        System.out.println("c = " + comparacao + "/ t = " + troca);
    }
}
