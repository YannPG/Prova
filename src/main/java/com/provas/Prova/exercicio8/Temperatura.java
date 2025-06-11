package com.provas.Prova.exercicio8;

public class Temperatura {

    public Double converterParaFahrenheit(Double tempCelsius) {
        return (tempCelsius * 9.0 / 5.0) + 32.0;
    }

    public Double converterParaCelsius(Double tempFahrenheit) {
        return (5.0 / 9.0) * (tempFahrenheit - 32.0);
    }
}
