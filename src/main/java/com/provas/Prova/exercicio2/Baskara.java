package com.provas.Prova.exercicio2;

public class Baskara {

    private Double a;

    private Double b;

    private Double c;

    public Double getA() {
        return a;
    }

    public Double getB(){
        return b;
    }

    public Double getC(){
        return c;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double calcularX1(Double a, Double b, Double c){
        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/2*a;
    }

    public Double calcularX2(Double a, Double b, Double c){
        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/2*a;
    }

    public boolean verificar() {
        if (Math.pow(b, 2) - 4 * a * c > 0) {
            return true;
        } else {
            return false;
        }
    }
}
