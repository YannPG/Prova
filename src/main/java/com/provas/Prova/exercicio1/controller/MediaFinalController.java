package com.provas.Prova.exercicio1.controller;

import com.provas.Prova.exercicio1.MediaFinal;

import java.util.Scanner;

public class MediaFinalController {

    public void exercicioMedia(){
        Scanner sc = new Scanner(System.in);

        MediaFinal mediaFinal = new MediaFinal();

        System.out.println("Digite a nota 1: ");
        mediaFinal.setNota1(sc.nextFloat());
        System.out.println("Digite a nota 2: ");
        mediaFinal.setNota2(sc.nextFloat());

        MediaFinal nota = new MediaFinal();
        Float mediafinal = nota.calcularMediaFinal(mediaFinal.getNota1(), mediaFinal.getNota2());
        System.out.printf("\nA média final será: %.1f", mediafinal);
        if(mediafinal >= 60){
            System.out.println("\nAluno aprovado com sucesso!");
        } else {
            System.out.println("\nAluno reprovado!");
        }
    }
}
