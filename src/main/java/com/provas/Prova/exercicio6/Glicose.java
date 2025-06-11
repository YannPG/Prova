package com.provas.Prova.exercicio6;

public class Glicose {

    private Double medidaGlicose;

    public Double getMedidaGlicose() {
        return medidaGlicose;
    }

    public void setMedidaGlicose(Double medidaGlicose) {
        this.medidaGlicose = medidaGlicose;
    }

    public String verificarClassificacao(Double medidaGlicose) {
        if (medidaGlicose <= 100.0) {
            return "Normal";
        } else if (medidaGlicose <= 140.0) {
            return "Elevado";
        } else {
            return "Diabetes";
        }
    }
}