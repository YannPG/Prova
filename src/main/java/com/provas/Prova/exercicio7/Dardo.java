package com.provas.Prova.exercicio7;

public class Dardo {

    private Double distancia1;
    private Double distancia2;
    private Double distancia3;

    public Double getDistancia1() {
        return distancia1;
    }

    public void setDistancia1(Double distancia1) {
        this.distancia1 = distancia1;
    }

    public Double getDistancia2() {
        return distancia2;
    }

    public void setDistancia2(Double distancia2) {
        this.distancia2 = distancia2;
    }

    public Double getDistancia3() {
        return distancia3;
    }

    public void setDistancia3(Double distancia3) {
        this.distancia3 = distancia3;
    }

    public Double verificarMaiorDistancia() {
        return Math.max(distancia1, Math.max(distancia2, distancia3));
    }
}