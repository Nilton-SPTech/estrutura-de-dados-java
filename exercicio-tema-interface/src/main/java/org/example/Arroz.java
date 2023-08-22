package org.example;

public class Arroz implements ICozinhar{

    private Integer qntDaPorcao;
    private Double qntDeAgua;
    private Integer temperaturaDoFogo;

    public Arroz(Integer qntDaPorcao, Double qntDeAgua, Integer temperaturaDoFogo) {
        this.qntDaPorcao = qntDaPorcao;
        this.qntDeAgua = qntDeAgua;
        this.temperaturaDoFogo = temperaturaDoFogo;
    }

    @Override
    public Double calcularTempoDeCozimento() {
        return ((qntDaPorcao * 250) + qntDeAgua) / temperaturaDoFogo;
    }

    @Override
    public String toString() {
        return "Arroz{" +
                "qntDaPorcao=" + qntDaPorcao +
                ", qntDeAgua=" + qntDeAgua +
                ", temperaturaDoFogo=" + temperaturaDoFogo +
                '}';
    }
}
