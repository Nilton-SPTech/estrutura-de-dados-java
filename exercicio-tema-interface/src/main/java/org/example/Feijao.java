package org.example;

public class Feijao implements ICozinhar{
    private Integer qntDaPorcao;
    private Double qntDeAgua;
    private Integer temperaturaDoFogo;
    private Double pressaoDaPanela;

    public Feijao(Integer qntDaPorcao, Double qntDeAgua, Integer temperaturaDoFogo, Double pressaoDaPanela) {
        this.qntDaPorcao = qntDaPorcao;
        this.qntDeAgua = qntDeAgua;
        this.temperaturaDoFogo = temperaturaDoFogo;
        this.pressaoDaPanela = pressaoDaPanela;
    }

    @Override
    public Double calcularTempoDeCozimento(){
        return ((qntDaPorcao * 100) + qntDeAgua) / temperaturaDoFogo + pressaoDaPanela;
    }

    @Override
    public String toString() {
        return "Feijao{" +
                "qntDaPorcao=" + qntDaPorcao +
                ", qntDeAgua=" + qntDeAgua +
                ", temperaturaDoFogo=" + temperaturaDoFogo +
                ", pressaoDaPanela=" + pressaoDaPanela +
                '}';
    }
}
