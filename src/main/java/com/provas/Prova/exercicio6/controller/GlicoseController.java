package com.provas.Prova.exercicio6.controller;

import com.provas.Prova.exercicio6.Glicose;

import java.util.Scanner;

public class GlicoseController {

    public void executarExercicio6() {
        Scanner sc = new Scanner(System.in);
        Glicose glicose = new Glicose();

        System.out.print("Digite a medida da glicose: ");
        glicose.setMedidaGlicose(sc.nextDouble());

        String classificacao = glicose.verificarClassificacao(glicose.getMedidaGlicose());

        System.out.println("Classificacao: " + classificacao);
    }
}
