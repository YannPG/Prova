package com.provas.Prova.exercicio4.controller;

import com.provas.Prova.exercicio4.PlanoTelefonia;

import java.util.Scanner;

public class PlanoTelefoniaController {
    public void exercicio4() {
        Scanner sc = new Scanner(System.in);

        PlanoTelefonia plano = new PlanoTelefonia();
        System.out.println("Digite a quantidade de minutos : ");
        plano.setMinutos(sc.nextDouble());

        System.out.println("Valor a pagar: R$" + plano.calcularValor(plano.getMinutos()));
    }
}
