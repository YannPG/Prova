package com.provas.Prova.exercicio10;


public class Numeros {

    private Integer numero1;
    private Integer numero2;

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    public boolean verificarMultiplos() {
        if (this.numero1 % this.numero2 == 0 || this.numero2 % this.numero1 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
