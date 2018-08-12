package cursojava.basico.aula33.exercicios.exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

//		2. Crie	uma	classe	para	representar	uma	conta	corrente	que	possui	um	
//		número,	um	saldo,	um	status	que	informa	se	ela	é	especial	ou	não, um	
//		limite. Desenvolva	métodos	para	realizar	saque	(verificando	se	o	cliente	
//		pode	realizar	saques),	despositar	dinheiro,	consultar	saldo	e	verificar	se	o	
//		cliente	está	usando	cheque	especial	ou	não.	Desenvolva	um	programa	
//		para	testar	essa	classe.
		
		
		Scanner scan = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();
		
		boolean sair = false;		
		
		System.out.print("Informe o número da conta: ");
		conta.setNumero(scan.nextInt());
		
		System.out.print("Informe a agência: ");
		conta.setAgencia(scan.nextInt());
				
		while(!sair) {
			while(!conta.isValidarOperacao()) {
				conta.mostrarOperacao();
				System.out.print("Informe a operação a ser utilizada: ");
				conta.validarOperacao(scan.nextInt());				
			}
			
			switch (conta.getOperacao()){
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
			
			conta.setValidarOperacao(false);
		}	
	}
}