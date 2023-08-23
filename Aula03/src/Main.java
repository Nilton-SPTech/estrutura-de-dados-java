import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // CRIAÇÃO DO OBJETO LEITOR
        Scanner leitor = new Scanner(System.in);

        // DECLARAÇÃO E CRIAÇÃO DE UM VETOR DE TAMANHO 5
        int[] vetor = new int[5];

        //PREENCHENDO O VETOR COM VALORES DIGITADOS PELO USUÁRIO
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor de vetor["+ i + "]: ");
            vetor[i] = leitor.nextInt();
        }

        //DELCARAÇÃO E CRIAÇÃO DE UM VETOR JÁ INICIALIZADO COM VALORES
        int[] v = {100, 200, 300, 400, 500};
        exibeVetor(vetor);

        // DECLARAÇÃO E CRIAÇÃO DE UM VETOR DE String
        String[] vetorString = new String[4];
        for (int i = 0; i < vetorString.length; i++) {
            System.out.println("Digite o valor de vetorString["+ i + "]: ");
            vetorString[i] = leitor.next();
        }
        exibeVetor(vetorString);
    }

    public static void exibeVetor(int[] v){
        System.out.println("Valores do vetor \n" + Arrays.toString(v));
    }

    public static void exibeVetor(String[] v){
        System.out.println("Valores do vetor \n" + Arrays.toString(v));
    }
}