package cursojava.basico.aula43.exercicios.exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Contribuinte contribuinte = new Contribuinte();
		int escolha;
		double salario;
		boolean sair = false;
		
		System.out.println("########################## CALCULADORA DE IMPOSTO ##########################");
		
		while(sair==false) {
			System.out.println("OPÇÕES:");
			System.out.println("1) Calcular imposto de Pessoa Física");
			System.out.println("2) Calcular imposto de Pessoa Jurídica");
			System.out.println("3) SAIR");
			System.out.print("Escolha a opção: ");
			escolha = scan.nextInt();
			
			if(escolha==1) {
				System.out.print("Informe o salário: R$ ");
				salario = scan.nextDouble();
				contribuinte.setPessoaFisica(true);
				System.out.println("O valor do imposto a ser pago é de R$ " + contribuinte.calcularImposto(salario));
			} else if (escolha==2) {
				System.out.print("Informe o salário: R$ ");
				salario = scan.nextDouble();
				contribuinte.setPessoaFisica(false);
				System.out.println("O valor do imposto a ser pago é de R$ " + contribuinte.calcularImposto(salario));
			} else if (escolha==3){
				sair=true;
			} else {
				System.out.println("Opção inválida!");
				System.out.println("Escolha uma opção válida!");
			}			
		}
	}
}