package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

//		12. Faça um programa para o cálculo de uma folha de pagamento,
//		sabendo que os descontos são do Imposto de Renda, que depende do	
//		salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
//		FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
//		a empresa que deposita). O Salário Líquido corresponde ao Salário
//		Bruto menos os descontos. O programa deverá pedir ao usuário o
//		valor da sua hora e a quantidade de horas trabalhadas no mês.
//		o Desconto do IR:
//		o Salário Bruto até 900 (inclusive) - isento
//		o Salário Bruto até 1500 (inclusive) - desconto de 5%
//		o Salário Bruto até 2500 (inclusive) - desconto de 10%
//		o Salário Bruto acima de 2500 - desconto de 20% 
//		Imprima na tela as informações, dispostas conforme o exemplo abaixo. No
//		exemplo o valor da hora é 5 e a quantidade de hora é 220.
//		Salário Bruto: (5 * 220) : R$ 1100,00
//		(-) IR (5%) : R$ 55,00
//		(-) INSS ( 10%) : R$ 110,00
//		FGTS (11%) : R$ 121,00
//		Total de descontos : R$ 165,00
//		Salário Liquido : R$ 935,00
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informre o valor da sua hora trabalhada: R$ ");
		double valorHora = scan.nextDouble();
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salBruto = valorHora*horasTrabalhadas;
		double inss = salBruto*10/100;
		double fgts = salBruto*11/100;
		double ir;
		double totalDescontos;
		double salLiquido;
		
		if(salBruto <= 900) {
			ir=salBruto*0/100;
			totalDescontos = ir + inss;
			salLiquido =  salBruto-totalDescontos;
			System.out.println("Salário Bruto (R$ " + valorHora + " * " + horasTrabalhadas + "h) = R$ " + salBruto);
			System.out.println("(-) IR (ISENTO) = R$ " + ir);
			System.out.println("(-) INSS (10%) = R$ " + inss);
			System.out.println("FGTS (11%) = R$ " + fgts);
			System.out.println("Total de descontos: R$ " + totalDescontos);
			System.out.println("Salário líquido: R$ " + salLiquido);
		} else if(salBruto <= 1500) {
			ir=salBruto*5/100;
			totalDescontos = ir + inss;
			salLiquido =  salBruto-totalDescontos;
			System.out.println("Salário Bruto (R$ " + valorHora + " * " + horasTrabalhadas + "h) = R$ " + salBruto);
			System.out.println("(-) IR = R$ " + ir);
			System.out.println("(-) INSS (10%) = R$ " + inss);
			System.out.println("FGTS (11%) = R$ " + fgts);
			System.out.println("Total de descontos: R$ " + totalDescontos);
			System.out.println("Salário líquido: R$ " + salLiquido);
		} else if(salBruto <= 2500) {
			ir=salBruto*10/100;
			totalDescontos = ir + inss;
			salLiquido =  salBruto-totalDescontos;
			System.out.println("Salário Bruto (R$ " + valorHora + " * " + horasTrabalhadas + "h) = R$ " + salBruto);
			System.out.println("(-) IR = R$ " + ir);
			System.out.println("(-) INSS (10%) = R$ " + inss);
			System.out.println("FGTS (11%) = R$ " + fgts);
			System.out.println("Total de descontos: R$ " + totalDescontos);
			System.out.println("Salário líquido: R$ " + salLiquido);
		} else {
			ir=salBruto*20/100;
			totalDescontos = ir + inss;
			salLiquido =  salBruto-totalDescontos;
			System.out.println("Salário Bruto (R$ " + valorHora + " * " + horasTrabalhadas + "h) = R$ " + salBruto);
			System.out.println("(-) IR = R$ " + ir);
			System.out.println("(-) INSS (10%) = R$ " + inss);
			System.out.println("FGTS (11%) = R$ " + fgts);
			System.out.println("Total de descontos: R$ " + totalDescontos);
			System.out.println("Salário líquido: R$ " + salLiquido);
			
		}
	}

}
