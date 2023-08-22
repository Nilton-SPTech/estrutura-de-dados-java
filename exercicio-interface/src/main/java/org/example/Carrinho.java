package org.example;
import java.util.*;
public class Carrinho {
    private List<IVendavel> listVendavel;

    public Carrinho(){
        this.listVendavel = new ArrayList<IVendavel>();
    }

    public void adicionaVendavel(IVendavel v){
        this.listVendavel.add(v);
    }

    public Double calculaTotalVenda(){
        Double totalVenda = 0.0;
        Iterator var1 = listVendavel.iterator();

        while(var1.hasNext()){
            IVendavel v = (IVendavel) var1.next();
            totalVenda += v.getValorVenda();
        }
        return totalVenda;
    }

    public void exibeItensCarrinho(){
        Iterator var1 = listVendavel.iterator();
        while(var1.hasNext()){
            IVendavel v = (IVendavel) var1.next();
            System.out.println(v);
        }
    }

    public List<IVendavel> getListVendavel() {
        return listVendavel;
    }
}
