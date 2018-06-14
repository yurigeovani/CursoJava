package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

//		11. Altere o programa anterior para mostrar no final a soma dos números:
//				10. Faça um programa que receba dois números inteiros e gere os
//				números inteiros que estão no intervalo compreendido por eles.

		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int num1 = scan.nextInt();
		System.out.print("Informe o segundo número: ");
		int num2 = scan.nextInt();
		
		int soma = 0;
		
		if (num1<num2) {
			for (int i = num1+1; i<=num2-1; i++) {
				System.out.println("O número é " + i);
				soma += i;
			}
			System.out.println("A soma dos números é: " + soma);
		} else if (num2<num1) {
			for (int i = num2+1; i<=num1-1; i++) {
				System.out.println("O número é " + i);
				soma += i;
			}
			System.out.println("A soma dos números é: " + soma);
		} else {
			System.out.println("Os números são iguais: " + num1);
		}

	}

}
