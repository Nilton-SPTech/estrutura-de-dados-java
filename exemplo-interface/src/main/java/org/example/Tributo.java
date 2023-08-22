package org.example;
import java.util.List;
import java.util.ArrayList;

public class Tributo {
    public List<ITributavel> listITributavel;

    public Tributo(){
        listITributavel = new ArrayList<ITributavel>();
    }

    public void adicionaTributavel(ITributavel t){
        listITributavel.add(t);
    }

    public Double calculaTotalTributo() {
        Double somaTributo = 0.0;
        for (ITributavel t : listITributavel) {
            somaTributo += t.getValrorTributo();
        }
        return somaTributo;
    }
}
