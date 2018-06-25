package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {

//		29. Encontrar números primos é uma tarefa difícil. Faça um programa que
//		gera uma lista dos números primos existentes entre 1 e um número
//		inteiro informado pelo usuário.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Informe um número inteiro: ");
		int num = scan.nextInt();
		
		int cont = 0;
		
		System.out.println("Lista de números primos até " + num + ":");
		for(int i=1;i<=num;i++) {
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					cont++;
				}
			}
			if (cont==2) {
				System.out.println("Número " + i);
			}
			cont=0;
		}
	}
}
