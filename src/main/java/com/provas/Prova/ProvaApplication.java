package com.provas.Prova;

import com.provas.Prova.exercicio1.controller.MediaFinalController;
import com.provas.Prova.exercicio10.MultiplosController.MultiplosController;
import com.provas.Prova.exercicio11.FuncionarioController.AumentoController;
import com.provas.Prova.exercicio12.JogoController.JogoController;
import com.provas.Prova.exercicio13.PontoController.CoordenadasController;
import com.provas.Prova.exercicio2.controller.BaskaraController;
import com.provas.Prova.exercicio3.controller.MenorController;
import com.provas.Prova.exercicio4.controller.PlanoTelefoniaController;
import com.provas.Prova.exercicio5.controller.TrocoFaltaController;
import com.provas.Prova.exercicio6.controller.GlicoseController;
import com.provas.Prova.exercicio7.controller.DardoController;
import com.provas.Prova.exercicio8.TemperaturaController.TemperaturaController;
import com.provas.Prova.exercicio9.LanchoneteController.LanchoneteController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ProvaApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolha;

		do {
			// Exibe o menu de opções para o usuário
			System.out.println("\n---------- MENU DE EXERCÍCIOS ----------");
			System.out.println("1. Média Final");
			System.out.println("2. Fórmula de Baskara");
			System.out.println("3. Menor de Três Números");
			System.out.println("4. Plano de Telefonia");
			System.out.println("5. Cálculo de Troco");
			System.out.println("6. Medidor de Glicose");
			System.out.println("7. Lançamento de Dardo");
			System.out.println("8. Conversor de Temperatura");
			System.out.println("9. Lanchonete");
			System.out.println("10. Múltiplos");
			System.out.println("11. Aumento Salarial");
			System.out.println("12. Duração do Jogo");
			System.out.println("13. Coordenadas Cartesianas");
			System.out.println("0. Sair do Programa");
			System.out.print("\nDigite o número do exercício que deseja executar: ");

			escolha = sc.nextInt();
			System.out.println("----------------------------------------\n");

			// Executa o exercício escolhido
			switch (escolha) {
				case 1:
					new MediaFinalController().exercicioMedia();
					break;
				case 2:
					new BaskaraController().exercicios2();
					break;
				case 3:
					new MenorController().exercicio3();
					break;
				case 4:
					new PlanoTelefoniaController().exercicio4();
					break;
				case 5:
					new TrocoFaltaController().executar6(); // Mantido como no seu código original
					break;
				case 6:
					new GlicoseController().executarExercicio6();
					break;
				case 7:
					new DardoController().executarExercicio7();
					break;
				case 8:
					new TemperaturaController().executarExercicio8();
					break;
				case 9:
					new LanchoneteController().executarExercicio9();
					break;
				case 10:
					new MultiplosController().executarExercicio10();
					break;
				case 11:
					new AumentoController().executarExercicio11();
					break;
				case 12:
					new JogoController().executarExercicio12();
					break;
				case 13:
					new CoordenadasController().executarExercicio13();
					break;
				case 0:
					System.out.println("Encerrando o programa. Até logo! 👋");
					break;
				default:
					System.out.println("Opção inválida! Por favor, tente novamente.");
					break;
			}

		} while (escolha != 0);

		sc.close();
	}
}