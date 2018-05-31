package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

//		1. Faça um Programa que peça dois números e imprima o maior deles.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		double num1 = scan.nextDouble();
		System.out.print("Informe o segundo número: ");
		double num2 = scan.nextDouble();
		
		if (num1>num2) {
			System.out.println("O número 1 (" + num1 + ") é maior que o número 2 (" + num2 + ").");
		} else if (num2>num1){
			System.out.println("O número 2 (" + num2 + ") é maior que o número 1 (" + num1 + ").");
		} else {
			System.out.println("Os números são iguais!");
		}
	}

}
