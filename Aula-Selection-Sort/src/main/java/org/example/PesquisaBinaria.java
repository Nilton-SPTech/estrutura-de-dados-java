package org.example;

public class PesquisaBinaria {

    public static int pesquisaBinaria(int[] v, int x){
        int indInferior = 0;
        int indSuperior = v.length -1;

        while(indInferior <= indSuperior){
            int meio = (indInferior + indSuperior) / 2;
            if(x == v[meio]){
                return meio;
            }

            if(x > v[meio]){
                indInferior = meio + 1;
            }
            else{
                indSuperior = meio - 1;
            }
        }
        return -1;
    }
}
