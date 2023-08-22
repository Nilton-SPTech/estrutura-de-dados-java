package org.example;

public class Ovo implements ICozinhar{
    private Double qntDeAgua;
    private Integer temperaturaDoFogo;

    public Ovo(Double qntDeAgua, Integer temperaturaDoFogo) {
        this.qntDeAgua = qntDeAgua;
        this.temperaturaDoFogo = temperaturaDoFogo;
    }

    @Override
    public Double calcularTempoDeCozimento(){
        return qntDeAgua / temperaturaDoFogo;
    }

    @Override
    public String toString() {
        return "Ovo{" +
                "qntDeAgua=" + qntDeAgua +
                ", temperaturaDoFogo=" + temperaturaDoFogo +
                '}';
    }
}
