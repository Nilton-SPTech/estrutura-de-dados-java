package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ControleBonus {
    private List<IBonus> listBonus;

    public ControleBonus() {
        this.listBonus = new ArrayList<IBonus>();
    }

    public void adicionarBonus(IBonus b){
        listBonus.add(b);
    }

    public void listarBonus(){
        Iterator bonus = listBonus.iterator();
        while (bonus.hasNext()){
            IBonus b = (IBonus) bonus.next();
            System.out.println(b);
        }
    }

    public Double calcularGastoBonus(){
        Double somaBonus = 0.0;

        Iterator bonus = listBonus.iterator();
        while(bonus.hasNext()){
            IBonus b = (IBonus) bonus.next();
            somaBonus += b.getValorBonus();
        }
        return somaBonus;
    }
}
