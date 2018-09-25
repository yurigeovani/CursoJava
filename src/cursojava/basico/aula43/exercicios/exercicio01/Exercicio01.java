package cursojava.basico.aula43.exercicios.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean sair = false;
		int escolha = 0;
		ContaBancaria conta = new ContaBancaria();
		ContaPoupanca poupanca = new ContaPoupanca();
		
		System.out.println("################## CONTA BANCÁRIA ##################");
		System.out.print("Nome: ");
		conta.setNomeCliente(scan.nextLine());
		System.out.print("Número: ");
		conta.setNumConta(scan.nextInt());
		
		while(!sair) {
			conta.opcoes();
			escolha = scan.nextInt();
			switch (escolha) {
			case 1:
				System.out.print("Informe o valor: R$ ");
				double vlrSaque = scan.nextDouble();
				conta.sacar(vlrSaque);
				break;
			case 2:
				System.out.print("Informe o valor: R$ ");
				double vlrDeposito = scan.nextDouble();
				conta.depositar(vlrDeposito);
				break;
			case 3:
				System.out.println("Saldo: R$ " + conta.consultarSaldo());
				break;
			case 4:
				System.out.print("Informe o percentual de rendimento ao dia: ");
				poupanca.setDiaRendimento(scan.nextDouble());
				poupanca.consultarSaldo2();
				break;
			case 0:
				sair = true;
				break;
			default:
				System.out.println("Informe uma opção válida!");
				break;
			}
		}
	}

}