package estruturaCondicional;

import java.util.Scanner;

public class triangulos {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int v1, v2, v3;

		System.out.println("Informe o valor 1");
		v1 = ler.nextInt();

		System.out.println("Informe o valor 2");
		v2 = ler.nextInt();

		System.out.println("Informe o valor 3");
		v3 = ler.nextInt();


		if (v1 == v2 && v2 == v3) {
			System.out.println("O triângulo é equilátero");
		}

		else if (v1 == v2 || v2 == v3 || v1 == v3){
			System.out.println("O triângulo é isósceles");
		}		

		else {
			System.out.println("O triângulo é escaleno");
		}

		ler.close();


	}
}

