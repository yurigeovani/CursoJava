package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

//		18. Faça um programa que peça um número inteiro e determine se ele é
//		ou não um número primo. Um número primo é aquele que é divisível
//		somente por ele mesmo e por 1.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int numero = scan.nextInt();
		int validador = 0;
		
		for (int i = 1; i<=numero; i++) {
			if (numero%i==0) {
				validador++;
			}
		}
		if (validador==2) {
			System.out.println("É um número primo!");
		} else {
			System.out.println("Não é um número primo!");
		}
	}

}
