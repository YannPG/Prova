package com.provas.Prova.exercicio11.FuncionarioController;

import com.provas.Prova.exercicio11.Funcionario;
import java.util.Locale;
import java.util.Scanner;

public class AumentoController {

    public void executarExercicio11() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Digite o salario da pessoa: ");
        funcionario.setSalarioAtual(sc.nextDouble());

        funcionario.calcularAumento();

        System.out.printf("Novo salario R$ %.2f\n", funcionario.getNovoSalario());
        System.out.printf("Aumento R$ %.2f\n", funcionario.getValorAumento());
        System.out.printf("Porcentagem = %d%%\n", funcionario.getPorcentagemAumento());
    }
}
