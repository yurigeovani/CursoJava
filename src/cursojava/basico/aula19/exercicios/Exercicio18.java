package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

//		18. Ler um vetor A com 10 elementos inteiros correspondentes as idades
//		de um grupo de pessoas. Escreva um programa que determine e
//		escreva a menor e a maior idades e suas respectivas posições.
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		int idadeMax = Integer.MIN_VALUE;
		int idadeMin = Integer.MAX_VALUE;
		int posicaoMax = 0;
		int posicaoMin = 0;
		
		for(int i=0; i<idades.length;i++) {
			System.out.print("Informe a idade " + i + ":");
			idades[i]=scan.nextInt();
			if(idades[i]>idadeMax) {
				idadeMax=idades[i];
				posicaoMax=i;
			} else if(idades[i]<idadeMin) {
				idadeMin=idades[i];
				posicaoMin=i;
			}
		}
		System.out.println("Menor idade: " + idadeMin + ". Posição: " + posicaoMin);
		System.out.println("Maior idade: " + idadeMax + ". Posição: " + posicaoMax);
	}

}
