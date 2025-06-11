package com.provas.Prova.exercicio3;

public class Menor {
    private Long valor1;

    private Long valor2;

    private Long valor3;

    public Long getValor1() {
        return valor1;
    }

    public void setValor1(Long valor1) {
        this.valor1 = valor1;
    }

    public Long getValor2() {
        return valor2;
    }

    public void setValor2(Long valor2) {
        this.valor2 = valor2;
    }

    public Long getValor3() {
        return valor3;
    }

    public void setValor3(Long valor3) {
        this.valor3 = valor3;
    }

    public Long verificarMenor(Long valor1, Long valor2, Long valor3){
        Long menor = valor1;
        if(menor > valor2){
            menor = valor2;
        }
        if(menor > valor3){
            menor = valor3;
        }
        return menor;

    }
}
