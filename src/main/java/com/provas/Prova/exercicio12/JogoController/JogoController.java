package com.provas.Prova.exercicio12.JogoController;

import com.provas.Prova.exercicio12.Jogo;
import java.util.Scanner;

public class JogoController {

    public void executarExercicio12() {
        Scanner sc = new Scanner(System.in);
        Jogo jogo = new Jogo();

        System.out.print("Hora inicial: ");
        jogo.setHoraInicial(sc.nextInt());

        System.out.print("Hora final: ");
        jogo.setHoraFinal(sc.nextInt());

        int duracao = jogo.calcularDuracao();

        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
    }
}
