package com.provas.Prova.exercicio10.MultiplosController;


import com.provas.Prova.exercicio10.Numeros;
import java.util.Scanner;

public class MultiplosController {

    public void executarExercicio10() {
        Scanner sc = new Scanner(System.in);
        Numeros numeros = new Numeros();

        System.out.println("Digite dois numeros inteiros:");
        numeros.setNumero1(sc.nextInt());
        numeros.setNumero2(sc.nextInt());

        if (numeros.verificarMultiplos()) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }
    }
}
