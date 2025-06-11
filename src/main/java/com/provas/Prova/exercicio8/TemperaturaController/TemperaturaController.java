package com.provas.Prova.exercicio8.TemperaturaController;


import com.provas.Prova.exercicio8.Temperatura;
import java.util.Locale;
import java.util.Scanner;

public class TemperaturaController {

    public void executarExercicio8() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Temperatura conversor = new Temperatura();

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char escala = sc.next().toUpperCase().charAt(0);

        if (escala == 'F') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double tempFahrenheit = sc.nextDouble();
            double tempCelsius = conversor.converterParaCelsius(tempFahrenheit);
            System.out.printf("Temperatura equivalente em Celsius: %.2f\n", tempCelsius);

        } else if (escala == 'C') {
            System.out.print("Digite a temperatura em Celsius: ");
            double tempCelsius = sc.nextDouble();
            double tempFahrenheit = conversor.converterParaFahrenheit(tempCelsius);
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", tempFahrenheit);
        } else {
            System.out.println("Escala invalida. Por favor, digite C ou F.");
        }
    }
}
