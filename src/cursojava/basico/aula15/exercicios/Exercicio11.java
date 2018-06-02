package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

//		11. As Organizações Tabajara resolveram dar um aumento de salário aos
//		seus colaboradores e lhe contraram para desenvolver o programa que
//		calculará os reajustes.
//		-- Faça um programa que recebe o salário de um colaborador e o
//		reajuste segundo o seguinte critério, baseado no salário atual:
//		* salários até R$ 280,00 (incluindo): aumento de 20%
//		* salários entre R$ 280,00 e R$ 700,00 (incluindo): aumento de 15%
//		* salários entre R$ 700,00 e R$ 1500,00 (incluindo): aumento de 10%
//		* salários de R$ 1500,00 em diante: aumento de 5% 
//		Após o aumento ser realizado, informe na tela:
//		* o salário antes do reajuste;
//		* o percentual de aumento aplicado;
//		* o valor do aumento;
//		* o novo salário, após o aumento.

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o salário: R$ ");
		double sal = scan.nextDouble();
		int percentual;
		double aumento;
		double salAtual;

		if(sal<=280) {
			percentual = 20;
			aumento = sal*percentual/100;
			salAtual = sal + aumento;
			System.out.println("Salário antes do ajuste: R$ " + sal);
			System.out.println("Percentual aplicado: " + percentual + "%");
			System.out.println("Valor do aumento: R$ " + aumento);
			System.out.println("Novo salário: R$ " + salAtual);
		} else if (sal<=700) {
			percentual = 15;
			aumento = sal*percentual/100;
			salAtual = sal + aumento;
			System.out.println("Salário antes do ajuste: R$ " + sal);
			System.out.println("Percentual aplicado: " + percentual + "%");
			System.out.println("Valor do aumento: R$ " + aumento);
			System.out.println("Novo salário: R$ " + salAtual);
		} else if (sal<=1500) {
			percentual = 10;
			aumento = sal*percentual/100;
			salAtual = sal + aumento;
			System.out.println("Salário antes do ajuste: R$ " + sal);
			System.out.println("Percentual aplicado: " + percentual + "%");
			System.out.println("Valor do aumento: R$ " + aumento);
			System.out.println("Novo salário: R$ " + salAtual);
		} else {
			percentual = 5;
			aumento = sal*percentual/100;
			salAtual = sal + aumento;
			System.out.println("Salário antes do ajuste: R$ " + sal);
			System.out.println("Percentual aplicado: " + percentual + "%");
			System.out.println("Valor do aumento: R$ " + aumento);
			System.out.println("Novo salário: R$ " + salAtual);
		}
		
	}

}