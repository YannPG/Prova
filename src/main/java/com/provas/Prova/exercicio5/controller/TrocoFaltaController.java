package com.provas.Prova.exercicio5.controller;

import com.provas.Prova.exercicio5.TrocoFalta;

import java.util.Scanner;

public class TrocoFaltaController {
    public void executar6(){
        Scanner sc = new Scanner(System.in);

        TrocoFalta trocoFalta = new TrocoFalta();

        System.out.println("Digite o valor do produto: ");
        trocoFalta.setValorProduto(sc.nextDouble());
        System.out.println("Digite o quantidade de compradas: ");
        trocoFalta.setQuantidadeComprada(sc.nextDouble());
        System.out.println("Digite o valor entregue: ");
        trocoFalta.setValorRecebido(sc.nextDouble());

        Double troco = trocoFalta.verificarTroco(trocoFalta.getValorProduto(),trocoFalta.getQuantidadeComprada(), trocoFalta.getValorRecebido());
        if(troco>0){
            System.out.println("Dinheiro insuficiente, ainda falta: " + troco);
        } else if (troco==0){
            System.out.println("Não há troco");
        } else {
            System.out.println("TROCO: " + troco*-1);
        }
    }
}
