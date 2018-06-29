package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

//		12. Criar um vetor A com 10 elementos inteiros. Implementar um programa
//		que defina e escreva a soma de todos os elementos armazenados
//		neste vetor.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int soma = 0;
		
		for(int i = 0;i<vetor.length;i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor: ");
			vetor[i]=scan.nextInt();
			soma+=vetor[i];
		}
		System.out.println("Soma dos elementos do vetor: " + soma);
	}

}
