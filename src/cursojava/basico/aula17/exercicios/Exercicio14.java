package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

//		14. Faça um programa que peça 10 números inteiros, calcule e mostre a
//		quantidade de números pares e a quantidade de números impares.
		
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		int par = 0;
		int impar = 0;
		
		for (int i = 1; i<=10; i++) {
			System.out.print(i + ") Informe um número inteiro: ");
			numero = scan.nextInt();
			if (numero%2==0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Quantidade de números pares: " + par);
		System.out.println("Quantidade de números ímpares: " + impar);
	}

}
