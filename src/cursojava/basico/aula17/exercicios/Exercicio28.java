package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {

//		28.Os números primos possuem várias aplicações dentro da
//		Computação, por exemplo na Criptografia. Um número primo é aquele
//		que é divisível apenas por um e por ele mesmo. Faça um programa
//		que peça um número inteiro e determine se ele é ou não um número
//		primo.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num = scan.nextInt();
		
		int contador = 0;
		
		for(int i = 1; i<=num;i++) {
			if(num%i==0) {
				contador++;
			}
		}
		if(contador==2) {
			System.out.println("O número " + num + " é primo!");
		}else {
			System.out.println("O número " + num + " não é primo!");
		}
		
	}

}