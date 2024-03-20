package estruturaCondicional;

import java.util.Scanner;

public class DiasSemana {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int dia;

		System.out.println("Digite o número do dia da semana (1-7):");
		dia = ler.nextInt();

		if (dia == 1) {
			System.out.println("O dia é Segunda-Feira!");
		}

		else if (dia == 2) {
			System.out.println("O dia é Terça-Feira!");
		}

		else if (dia  == 3) {
			System.out.println("O dia é Quarta-Feira!");
		}

		else if (dia  == 4) {
			System.out.println("O dia é Quinta-Feira!");
		}

		else if (dia  == 5) {
			System.out.println("O dia é Sexta-Feira!");
		}
		else if (dia  == 6) {
			System.out.println("O dia é Sábado!");
		}
		else if (dia  == 7) {
			System.out.println("O dia é Domingo!");
		}


		else {
			System.out.println("Dia Inválido!");
		}

		ler.close();


	}
}




