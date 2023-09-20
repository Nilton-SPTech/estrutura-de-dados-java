package org.example;

import java.util.Arrays;

public class ListaEstatica {
    private int[] vetor;
    private int nroElem;

    public ListaEstatica(int tamanhoLista){
        vetor = new int[tamanhoLista];
        nroElem = 0;
    }

    public void aumentaVetor(int v[]){
        this.vetor = new int[nroElem + 10];
        for(int i = 0; i < v.length; i++){
            this.vetor[i] = v[i];
        }
    }
    //1
    public void adiciona(int valor){

        if(nroElem >= this.vetor.length){
            aumentaVetor(this.vetor);
        }

        vetor[nroElem] = valor;
        nroElem++;

    }


    //2
    public void exibe(){
        if(nroElem == 0){
            System.out.println("\nLista está vazia");
        }
        else{
            for (int i = 0; i < nroElem; i++){
                System.out.println(vetor[i]);
            }
        }
    }

    //3
    public int busca(int elemento){
        for (int i = 0; i < nroElem; i++){
            if (vetor[i] == elemento){
              return i;
            }
        }
        return  -1;
    }

    //4
    public boolean removerPeloIndice(int indice){
        if(indice > 0 || indice < nroElem){
            return  false;
        }
        nroElem--;

        for (int i = indice; i < nroElem; i++){
            vetor[i] = vetor[i + 1];
        }

        return true;
    }

    //5
    public boolean removeElemento(int elemento){
        return removerPeloIndice(busca(elemento));
    }


    // Substitui
    public boolean substitui(int valorAn, int valorNv){
        int indice = busca(valorAn);
        if(indice == -1){
            return false;
        }

        adiciona(valorAn);
        vetor[indice] = valorNv;

        return true;
    }

    //Conta ocorrências
    public int contaOcorrencia(int valor){
        int count = 0;

        for (int i = 0; i < nroElem; i++){
            if (vetor[i] == valor){
                count++;
            }
        }
        return count;
    }

    //Adiciona no inicio
    public boolean adicionaNoInicio(int valor){
        if(nroElem == this.vetor.length){
            aumentaVetor(this.vetor);
        }

        for (int i = vetor.length -1; i > 0; i--){
            vetor[i] = vetor[i - 1];
        }

        vetor[0] = valor;
        return true;
    }
}
