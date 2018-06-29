package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

//		14. Criar um vetor A com 10 elementos inteiros. Implementar um programa
//		que defina e escreva a média aritmética simples dos elementos
//		ímpares armazenados neste vetor.
		
		Scanner scan = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int cont = 0;
		double media = 0;
		
		for(int i=0;i<vetor.length;i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor: ");
			vetor[i]=scan.nextInt();
		}
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]%2!=0) {
				cont++;
				media+=vetor[i];
				System.out.println("Valor da posição " + i + " do Vetor ímpar: " + vetor[i]);
			}
		}
		System.out.println("Média: " + (media/cont));
	}

}
