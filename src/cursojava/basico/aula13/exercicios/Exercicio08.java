package cursojava.basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

//		8. Faça um Programa que pergunte quanto você ganha por hora e o
//		número de horas trabalhadas no mês. Calcule e mostre o total do seu
//		salário no referido mês.

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual o valor da sua hora trabalhada?");
		double vlrhr = scan.nextDouble();
		
		System.out.print("Informe quantas horas trabalhou neste mês: ");
		double hrtrabalhada = scan.nextDouble();
		
		System.out.print("O seu salário é: " + (vlrhr*hrtrabalhada));
	}

}
