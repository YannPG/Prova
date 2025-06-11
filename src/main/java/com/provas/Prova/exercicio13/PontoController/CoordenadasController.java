package com.provas.Prova.exercicio13.PontoController;

import com.provas.Prova.exercicio13.Ponto;
import java.util.Locale;
import java.util.Scanner;

public class CoordenadasController {

    public void executarExercicio13() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Ponto ponto = new Ponto();

        System.out.print("Valor de X: ");
        ponto.setX(sc.nextDouble());

        System.out.print("Valor de Y: ");
        ponto.setY(sc.nextDouble());

        String localizacao = ponto.verificarLocalizacao();

        System.out.println(localizacao);
    }
}
