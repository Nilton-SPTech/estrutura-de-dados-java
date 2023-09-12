package org.example;

public class Main {
    public static void main(String[] args) {
        int[] v1 = {11, 11,90,78,1,9, 100, -10, 0, 9000, 82, 33, -90, 1, 8787, -9090,210, 900};
        SelectionSort s = new SelectionSort();
        s.selectionSort(v1);

        System.out.println();
        int[] v2 = {11, 11,90,78,1,9, 100, -10, 0, 9000, 210,900, 82, 33, -90, 1, 8787, -9090};
        SelectionSort.selectionSortOtimizado(v2);

        System.out.println();
        int[] v3 = {11, 11,90,78,1,9, 100, -10, 0, 9000, 210,900, 82, 33, -90, 1, 8787, -9090};
        BubbleSort.bubbleSort(v3);

        System.out.println(PesquisaBinaria.pesquisaBinaria(v1, 9090));
    }
}