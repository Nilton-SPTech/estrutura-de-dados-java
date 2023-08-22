package org.example;
import java.util.List;
import java.util.ArrayList;

public class ControleCozimento {
    List<ICozinhar> listaCozinhar;

    public ControleCozimento(){
        listaCozinhar = new ArrayList<ICozinhar>();
    }

    public void adicionarTempoDeCozimento(ICozinhar cozinhar){
        listaCozinhar.add(cozinhar);
    }

    public String calculoDeOvosCuzidos(){
        Integer total = 0;

        for (ICozinhar c:
             listaCozinhar) {
            if(c instanceof Ovo){
                total++;
            }
        }

        return "Você tem " + total + " ovos cuzidos!";
    }
    public List<ICozinhar> listaDeCozimento(){
        return listaCozinhar;
    }


}
