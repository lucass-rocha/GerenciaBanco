package application;

import java.util.Scanner;
import entities.BankAccount;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe seu nome completo: ");
		String name = sc.nextLine();

		System.out.println("Informe seu CPF: ");
		long cpf = sc.nextLong();

		Double balance = 1000.00;

		// para melhor execução do programa, eu tomei a liberdade de atribuir como
		// valor inicial para o saldo R$ 1000.00

		BankAccount ba = new BankAccount(name, cpf, balance);

		int opcao;
		do {
		System.out.println("===== MENU INTERATIVO =====");
		System.out.println("(1) CONSULTAR SALDO");
		System.out.println("(2) REALIZAR DEPÓSITO");
		System.out.println("(3) REALIZAR SAQUE");
		System.out.println("(4) ENCERRAR APLICAÇÃO");
		System.out.println("===========================");

		opcao = sc.nextInt();
		switch (opcao) {
			case 1:
				System.out.println("Saldo atual: R$" + ba.getBalance());
				break;
			case 2:
				System.out.print("Digite o valor do depósito: R$");
				ba.deposit(sc.nextDouble());
				break;
			case 3:
				System.out.print("Digite o valor do saque: R$");
				ba.withdraw(sc.nextDouble());
				break;
			case 4:
				System.out.println("Encerrando aplicação. Obrigado!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
		}
	} while (opcao != 4);
	}

}
