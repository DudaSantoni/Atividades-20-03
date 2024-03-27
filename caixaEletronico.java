package estruturaCondicional;

import java.util.Scanner;

public class caixaEletronico {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String cpf = "12345678900", senha = "123456", senha1,cpf1;
		Double saldo = 10000.00, saque, saldoFinal;

		//cpf
		System.out.println("Informe o seu CPF");
		cpf1= ler.nextLine();

		//senha
		System.out.println("Informe sua senha");
		senha1 = ler.nextLine();


		//PROCESSAMENTO



		if (senha.equals(senha1) && (senha.equals(senha1))) {
			System.out.println("Informe o valor do saque desejado");
			saque = ler.nextDouble();

			if (saque <= saldo) {
				saldoFinal = saldo - saque;
				System.out.println("Saque realizado! Agora seu saldo é R$" + saldoFinal + " reais");
			}

			else { 
				System.out.println("Saque indisponível, saldo atual: R$" + saldo + " reais");
			}
		}
		else {System.out.println("Dados incorretos");
		}



		ler.close();

	}
}