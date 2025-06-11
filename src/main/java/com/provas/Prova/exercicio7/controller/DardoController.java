package com.provas.Prova.exercicio7.controller;

import com.provas.Prova.exercicio7.Dardo;
import java.util.Scanner;

public class DardoController {

    public void executarExercicio7() {
        Scanner sc = new Scanner(System.in);
        Dardo dardo = new Dardo();

        System.out.println("Digite as tres distancias:");
        dardo.setDistancia1(sc.nextDouble());
        dardo.setDistancia2(sc.nextDouble());
        dardo.setDistancia3(sc.nextDouble());

        Double maiorDistancia = dardo.verificarMaiorDistancia();

        System.out.println("MAIOR DISTANCIA = " + maiorDistancia);
    }
}