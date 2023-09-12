public class Teste {
    public static void main(String[] args) {
        int[] v = {11, 11,90,78,1,9, 100, -10, 0};
        selectionSort(v);
    }
    public static void selectionSort(int[] v){
        for (int i = 0; i < v.length -1; i++){
            for (int j = i + 1; j < v.length; j++){
                if (v[j] < v[i]){
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        System.out.print(v[i] + " ");
        }

    }
}
