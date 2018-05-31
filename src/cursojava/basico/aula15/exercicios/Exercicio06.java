package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

//		6. Faça um Programa que leia três números e mostre o maior deles.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		double num1 = scan.nextDouble();
		System.out.print("Informe o segundo numero: ");
		double num2 = scan.nextDouble();
		System.out.print("Informe o terceiro numero: ");
		double num3 = scan.nextDouble();
		
		if (num1>num2 && num1>num3) {
			System.out.println("O número 1 é o maior: " + num1);
		} else if (num2>num1 && num2>num3) {
			System.out.println("O número 2 é o maior: " + num2);
		} else if (num3>num1 && num3>num2) {
			System.out.println("O número 3 é o maior: " + num3);
		} else {
			System.out.println("Os números são iguais: ");
			System.out.println("Número 1: " + num1);
			System.out.println("Número 2: " + num2);
			System.out.println("Número 3: " + num3);
		}
		
	}

}
