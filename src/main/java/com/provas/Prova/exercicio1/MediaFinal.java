package com.provas.Prova.exercicio1;

public class MediaFinal {

    private Float nota1;

    private Float nota2;

    public Float getNota1() {
        return nota1;
    }

    public Float getNota2() {
        return nota2;
    }

    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }

    public Float calcularMediaFinal(Float nota1, Float nota2) {
        return (nota1 + nota2)/2;
    }
}
