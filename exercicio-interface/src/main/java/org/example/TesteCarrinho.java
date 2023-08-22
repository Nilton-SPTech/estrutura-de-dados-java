package org.example;
import com.sun.tools.javac.Main;

import java.util.*;

public class TesteCarrinho {
    static Carrinho carrinho = new Carrinho();

    public static void main(String[] args){
        Scanner leitor01 = new Scanner(System.in);
        Scanner leitor02 = new Scanner(System.in);


        Integer opcao;
        do{
            System.out.println("1 - Adicionar Livro\n" +
                    "2 - Adicionar DVD\n" +
                    "3 - Adicionar Serviço\n" +
                    "4 - Exibir itens do carrinho\n" +
                    "5 - Exibir total de venda\n" +
                    "6 - Fim");
            opcao = leitor01.nextInt();

            Double precoCusto = 0.0;
            String nome = "";
            switch (opcao){
                case 1:
                    System.out.println("Digite o Preço de Custo do Livro: ");
                    precoCusto = leitor02.nextDouble();

                    System.out.println("Digite o nome do Livro: ");
                    nome = leitor01.nextLine();

                    System.out.println("Digite o autor do Livro: ");
                    String autor = leitor02.nextLine();

                    System.out.println("Digite o ISBN do Livro: ");
                    String isbn = leitor01.nextLine();

                    addLivro(new Livro(addCodigo(), precoCusto, nome, autor, isbn));
                    break;
                case 2:
                    System.out.println("Digite o Preço de Custo do DVD: ");
                    precoCusto = leitor02.nextDouble();

                    System.out.println("Digite o nome do DVD: ");
                    nome = leitor01.nextLine();

                    System.out.println("Digite a gravadora do DVD: ");
                    String gravadora = leitor02.nextLine();

                    addDVD(new DVD(addCodigo(), precoCusto, nome, gravadora));
                    break;
                case 3:
                    System.out.println("Digite a Descricao do Serviço: ");
                    String descricao = leitor02.nextLine();

                    System.out.println("Digite a quantidade de horas do Serviço: ");
                    Integer quantHoras = leitor01.nextInt();

                    System.out.println("Digite o valor de horas do Serviço: ");
                    Double valorHora = leitor01.nextDouble();

                    addServico(new Servico(descricao, addCodigo(), quantHoras, valorHora));
                    break;
                case 4:
                    carrinho.exibeItensCarrinho();
                    break;
                case 5:
                    System.out.println("Total de venda do carrinho: " + carrinho.calculaTotalVenda());
                    break;
            }
        }
        while(opcao != 6);
    }

    public static void addLivro(Livro l){
        carrinho.adicionaVendavel(l);
    }

    public static void addDVD(DVD d){
        carrinho.adicionaVendavel(d);
    }

    public static void addServico(Servico s){
        carrinho.adicionaVendavel(s);
    }
    public static Integer addCodigo() {
        Integer cod = 1;
        for (IVendavel v : carrinho.getListVendavel()) {
            cod++;
        }
        return cod;
    }
}
