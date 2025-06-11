package com.provas.Prova.exercicio9.LanchoneteController;

import com.provas.Prova.exercicio9.Pedido;
import java.util.Locale;
import java.util.Scanner;

public class LanchoneteController {

    public void executarExercicio9() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Pedido pedido = new Pedido();

        System.out.print("Codigo do produto comprado: ");
        pedido.setCodigoProduto(sc.nextInt());

        System.out.print("Quantidade comprada: ");
        pedido.setQuantidade(sc.nextInt());

        Double totalAPagar = pedido.calcularTotal();

        System.out.printf("Valor a pagar: R$ %.2f\n", totalAPagar);
    }
}
