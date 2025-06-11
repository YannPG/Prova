package com.provas.Prova.exercicio13;


public class Ponto {

    private Double x;
    private Double y;

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public String verificarLocalizacao() {
        if (x == 0.0 && y == 0.0) {
            return "Origem";
        } else if (y == 0.0) {
            return "Eixo X";
        } else if (x == 0.0) {
            return "Eixo Y";
        } else if (x > 0.0 && y > 0.0) {
            return "Q1";
        } else if (x < 0.0 && y > 0.0) {
            return "Q2";
        } else if (x < 0.0 && y < 0.0) {
            return "Q3";
        } else { // x > 0.0 && y < 0.0
            return "Q4";
        }
    }
}
