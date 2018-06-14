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
		
		if (num1<num2) {
			for (int i = num1+1; i<=num2-1; i++) {
				System.out.println("O número é " + i);
			}
		} else if (num2<num1) {
			for (int i = num2+1; i<=num1-1; i++) {
				System.out.println("O número é " + i);
			}
		} else {
			System.out.println("Os números são iguais!");
		}
		
	}

}