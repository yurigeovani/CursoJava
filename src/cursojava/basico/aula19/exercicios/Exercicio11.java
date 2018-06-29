package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

//		11. Criar um vetor A com 10 elementos inteiros. Implementar um programa
//		que defina e escreva a quantidade de elementos armazenados neste
//		vetor que são pares.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int cont = 0;
		
		for(int i=0;i<vetor.length;i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor: ");
			vetor[i]=scan.nextInt();
		}
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]%2==0) {
				cont++;
				System.out.println("Valor da posição " + i + " do Vetor é par: " + vetor[i]);
			}
		}
		System.out.println("Total de elementos pares = " + cont);
	}

}
