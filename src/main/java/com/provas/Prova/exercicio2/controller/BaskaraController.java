package com.provas.Prova.exercicio2.controller;

import com.provas.Prova.exercicio2.Baskara;

import java.util.Scanner;

public class BaskaraController {
    public void exercicios2(){
        Scanner sc = new Scanner(System.in);

        Baskara baskara = new Baskara();
        System.out.println("Digite o coeficiente de a");
        baskara.setA(sc.nextDouble());
        System.out.println("Digite o coeficiente de b");
        baskara.setB(sc.nextDouble());
        System.out.println("Digite o coeficiente de c");
        baskara.setC(sc.nextDouble());

        if(baskara.verificar()){
            System.out.printf("O valor de x1 é: %4f", baskara.calcularX1(baskara.getA(), baskara.getB(), baskara.getC()));
            System.out.printf("O valor de x1 é: %4f", baskara.calcularX2(baskara.getA(), baskara.getB(), baskara.getC()));
        } else {
            System.out.println("Não possui raizes reais.");
        }


    }
}
