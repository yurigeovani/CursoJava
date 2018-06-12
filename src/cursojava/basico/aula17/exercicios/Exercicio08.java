package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

//		8. Faça um programa que leia 5 números e informe a soma e a média
//		dos números.

		Scanner scan = new Scanner (System.in);
		
		double numero = 0;
		double soma = 0;
		
		for (int i = 0; i<5;i++) {
			System.out.print("Informe um número: ");
			numero = scan.nextDouble();
			
			soma += numero;
		}
		
		System.out.println("A soma dos números é: " + soma);
		System.out.println("A média dos número é: " + (soma/5));
	}

}
