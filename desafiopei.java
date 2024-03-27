package estruturaCondicional;

import java.util.Scanner;

public class desafiopei {

	public static void main(String[] args) {


		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Informe o número");
		numero = ler.nextInt();

		if (numero %2 == 0) {
			System.out.println("O seu número é par");
		}

		else {
			System.out.println("O número é ímpar");

		}

		ler.close();

	}

}
