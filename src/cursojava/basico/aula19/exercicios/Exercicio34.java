package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		
//		34. Criar um vetor A com 10 elementos inteiros. Escreva um programa que
//		imprima cada elemento do vetor A e a relação de todos os pares de 0
//		até o respectivo elemento.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor A: ");
			vetorA[i]=scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Relação de números pares até " + vetorA[i] + ": ");
			for(int j=1; j<=vetorA[i]; j++) {
				if(j%2==0) {
					System.out.println(j + " ");
				}
			}
		}
		
	}

}