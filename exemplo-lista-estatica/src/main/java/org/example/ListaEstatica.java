package org.example;

import java.util.Arrays;

public class ListaEstatica {
    private int[] vetor;
    private int nroElem;

    public ListaEstatica(int tamanhoLista){
        vetor = new int[tamanhoLista];
        nroElem = 0;
    }

    //1
    public void adiciona(int valor){

        if(nroElem == vetor.length -1){
            System.out.println("Lista cheia");
            throw new IllegalStateException("Lista Cheia!");
        }
        else{
            vetor[nroElem] = valor;
            nroElem++;
        }
    }


    //2
    public void exibe(){
        for (int i = 0; i < nroElem; i++){
            System.out.println(vetor[i]);
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
}
