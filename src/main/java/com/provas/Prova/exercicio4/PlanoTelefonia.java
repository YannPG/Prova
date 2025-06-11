package com.provas.Prova.exercicio4;

public class PlanoTelefonia {
     public Double minutos;

    public Double getMinutos() {
        return minutos;
    }

    public void setMinutos(Double minutos) {
        this.minutos = minutos;
    }

    public Double calcularValor(Double minutos){
        if (minutos<100){
            return 50.00;
        } else {
            return 50 + ((minutos-100)*2);
        }
    }
}
