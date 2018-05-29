package cursojava.basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
//		13. Faça um Programa que pergunte quanto você ganha por hora e o
//		número de horas trabalhadas no mês. Calcule e mostre o total do seu
//		salário no referido mês, sabendo-se que são descontados 11% para o
//		Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
//		programa que nos dê:
//		. salário bruto.
//		a. quanto pagou ao INSS.
//		b. quanto pagou ao sindicato.
//		c. o salário líquido.
//		d. calcule os descontos e o salário líquido, conforme a tabela
//		abaixo:
//		+ Salário Bruto : R$ - IR (11%) : R$ - INSS
//		(8%) : R$ - Sindicato ( 5%) : R$ = Salário
//		Liquido : R$	
//		  	
//		  
//		Obs.: Salário Bruto - Descontos = Salário Líquido.
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual o valor da sua hora trabalhada?");
		double vlrhr = scan.nextDouble();
		
		System.out.print("Informe quantas horas trabalhou neste mês: ");
		double hrtrabalhada = scan.nextDouble();
		
		double salariobruto = vlrhr * hrtrabalhada;
		double ir = salariobruto * 11/100;
		double inss = salariobruto * 8/100;
		double sind = salariobruto * 5/100;
		double salarioliq = salariobruto - ir - inss - sind;
		
		System.out.println("O seu salário bruto é: " + salariobruto);
		System.out.println("a) IR: " + ir);
		System.out.println("b) INSS: " + inss);
		System.out.println("c) Sindicato: " + sind);
		System.out.println("d) Salário líquido: " + salarioliq);
		System.out.println("e) Total de descontos: " + (ir+inss+sind));
		
	}

}
