package org.example;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] v){
        for(int i = 0; i < v.length -1; i++){
            for (int j = 1; j < v.length - i ; j++){
                if(v[j-1] > v[j]){
                    int aux = v[j];
                    v[j] = v[j-1];
                    v[j-1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(v));
    }
}
