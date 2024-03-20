package estruturaCondicional;

import java.util.Scanner;

public class PrimeiroSe {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Digite um valor:");
		numero = ler.nextInt ();

		// { = Então
		if(numero >= 10) {
			System.out.println("O número é maior ou igual a 10");
		}

		else {
			System.out.println("O número é menor do que 10");
		}

		ler.close();


	}

}
