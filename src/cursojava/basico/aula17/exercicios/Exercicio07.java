package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

//		7. Faça um programa que leia 5 números e informe o maior número.
	
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		int maiorNumero = Integer.MIN_VALUE;
		
		for (int i = 0; i<5; i++) {
			System.out.print("Informe um número: ");
			numero = scan.nextInt();
					
			if (numero>maiorNumero) {
				maiorNumero = numero;
                System.out.println("o número maior mudou: " + maiorNumero);
			}
		}
		
		System.out.println("O maior número é: " + maiorNumero);
		
	}

}
