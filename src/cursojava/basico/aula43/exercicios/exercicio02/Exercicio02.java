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
			System.out.println("OP��ES:");
			System.out.println("1) Calcular imposto de Pessoa F�sica");
			System.out.println("2) Calcular imposto de Pessoa Jur�dica");
			System.out.println("3) SAIR");
			System.out.print("Escolha a op��o: ");
			escolha = scan.nextInt();
			
			if(escolha==1) {
				System.out.print("Informe o sal�rio: R$ ");
				salario = scan.nextDouble();
				contribuinte.setPessoaFisica(true);
				System.out.println("O valor do imposto a ser pago � de R$ " + contribuinte.calcularImposto(salario));
			} else if (escolha==2) {
				System.out.print("Informe o sal�rio: R$ ");
				salario = scan.nextDouble();
				contribuinte.setPessoaFisica(false);
				System.out.println("O valor do imposto a ser pago � de R$ " + contribuinte.calcularImposto(salario));
			} else if (escolha==3){
				sair=true;
			} else {
				System.out.println("Op��o inv�lida!");
				System.out.println("Escolha uma op��o v�lida!");
			}			
		}
	}
}