package aplicacao;
import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;
public class programa {

	public static void main(String[] args) {
	    Locale.setDefault(Locale.ENGLISH);
		Scanner leitor = new Scanner (System.in);
		Conta conta;
		// criando contas//
		System.out.println("Digite os dados da conta");
		System.out.println("Entre com o n?mero da conta");
		int numero = leitor.nextInt();
		System.out.println("Entre com o titular da conta");
		leitor.nextLine();
		String titular = leitor.nextLine();
		System.out.println("Tem valor de deposito inicial?(s/n)");
		char resposta = leitor.next().charAt(0);
		if(resposta == 's') {
		System.out.println("Digite o valor do montante inicial");
		double valorInicial = leitor.nextDouble();
		conta = new Conta(numero,titular,valorInicial);
	}   else { conta = new Conta(numero,titular);
	}
		System.out.println("Dados da conta");
		System.out.println(conta);
		System.out.println("Sua conta foi criada com sucesso");
		System.out.println("O que deseja fazer? 1 para depositar um certo valor , 2 para retirar da sua conta um certo valor e qualquer outro valor para encerrar");
		int opcao = leitor.nextInt();
		while (opcao == 1 || opcao==2) {
		if(opcao == 1) {
			System.out.println("Digite o valor que quer depositar");
			double deposito = leitor.nextDouble();
			conta.depositar(deposito);
		} else {
		if(opcao == 2) {
			System.out.println("Digite o valor que quer sacar");
			double saque = leitor.nextDouble();
			conta.sacar(saque);
		
	}	
    }
    }
    }
    }
	