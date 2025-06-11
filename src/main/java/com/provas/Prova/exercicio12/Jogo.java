package com.provas.Prova.exercicio12;


public class Jogo {

    private Integer horaInicial;
    private Integer horaFinal;

    public Integer getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Integer horaInicial) {
        this.horaInicial = horaInicial;
    }

    public Integer getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Integer horaFinal) {
        this.horaFinal = horaFinal;
    }

    public int calcularDuracao() {
        int duracao;
        if (this.horaInicial < this.horaFinal) {
            duracao = this.horaFinal - this.horaInicial;
        } else {
            duracao = 24 - this.horaInicial + this.horaFinal;
        }
        return duracao;
    }
}
