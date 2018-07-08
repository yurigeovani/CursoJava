package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {

//		33. Criar um vetor A com 10 elementos inteiros. Escreva um programa que
//		imprima cada elemento do vetor A e uma mensagem indicando se o
//		respectivo elemento é um número primo ou não.

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int count = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor A: ");
			vetorA[i]=scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			for(int j=1; j<=vetorA[i]; j++) {
				if(vetorA[i]%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("O valor da posição " + i + " do Vetor É PRIMO: " + vetorA[i]);
			} else {
				System.out.println("O valor da posição " + i + " do Vetor NÃO É PRIMO: " + vetorA[i]);

			}
			count=0;
		}		
		
	}

}
