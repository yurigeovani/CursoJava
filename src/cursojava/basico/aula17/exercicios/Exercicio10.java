package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

//		10. Faça um programa que receba dois números inteiros e gere os
//		números inteiros que estão no intervalo compreendido por eles.
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int num1 = scan.nextInt();
		System.out.print("Informe o segundo número: ");
		int num2 = scan.nextInt();
		
		for (int i = num1; i<=num2; i++) {
			System.out.println("O número é " + i);
		}
		
	}

}
