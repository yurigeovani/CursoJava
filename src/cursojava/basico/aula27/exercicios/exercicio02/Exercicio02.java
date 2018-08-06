package cursojava.basico.aula27.exercicios.exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();
		
		conta.especial = true;
		conta.chequeEspecial = 1000;
		conta.limite = conta.chequeEspecial + conta.saldo;
		boolean sair = false;
		boolean validarOperacao = false;
		int operacao = 0;
		
		
		System.out.print("Informe o número da conta: ");
		conta.numero = scan.nextInt();
		
		System.out.print("Informe a agência: ");
		conta.agencia = scan.nextInt();
				
		while(!sair) {
			while(!validarOperacao) {
				System.out.println("Operações disponíveis: ");
				System.out.println("1) Realizar saque");
				System.out.println("2) Realizar depósito");
				System.out.println("3) Verificar saldo");
				System.out.println("4) Verificar limite especial");
				System.out.println("5) Sair");
				System.out.print("Informe a operação a ser utilizada: ");
				operacao = scan.nextInt();
				
			}
			
			switch (operacao) {
			case 1:
				System.out.print("Informe o valor: R$ ");
				conta.realizarSaque(scan.nextDouble());
				break;
				
			case 2:
				System.out.print("Informe o valor: R$ ");
				conta.realizarDeposito(scan.nextDouble());
				break;

			case 3:
				conta.consultarSaldo();
				break;
				
			case 4:
				conta.verificarLimite();
				break;
				
			case 5:
				sair = true;
				break;
			}
			
			validarOperacao = false;
		}
		
	}

}