import org.example.SelectionSort;

import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        int[] v1 = {11, 11,90,78,1,9, 100, -10, 0, 9000, 82, 33, -90, 1, 8787, -9090};
        SelectionSort.selectionSort(v1);

        System.out.println();
        int[] v2 = {11, 11,90,78,1,9, 100, -10, 0, 9000, 82, 33, -90, 1, 8787, -9090};
        SelectionSort.selectionSortOtimizado(v2);
    }




}
