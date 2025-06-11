package com.provas.Prova.exercicio3.controller;

import com.provas.Prova.exercicio3.Menor;

import java.util.Scanner;

public class MenorController {

    public void exercicio3(){
        Scanner sc = new Scanner(System.in);

        Menor menor = new Menor();
        System.out.println("Digite o primeiro valor: ");
        menor.setValor1(sc.nextLong());
        System.out.println("Digite o segundo valor: ");
        menor.setValor2(sc.nextLong());
        System.out.println("Digite o terceiro valor: ");
        menor.setValor3(sc.nextLong());

        Long menorValor = menor.verificarMenor(menor.getValor1(), menor.getValor2(), menor.getValor3());
        System.out.println("O menor valor é " + menorValor);
    }
}
