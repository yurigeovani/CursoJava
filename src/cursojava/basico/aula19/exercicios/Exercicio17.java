package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

//		17. Ler um vetor A com 10 elementos inteiros correspondentes as idades
//		de um grupo de pessoas. Escreva um programa que determine e
//		escreva a quantidade de pessoas que possuem idade superior a 35
//		anos.
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		int cont = 0;
		
		for(int i = 0;i<idades.length;i++) {
			System.out.print("Informe a idade " + i + ":");
			idades[i]=scan.nextInt();
		}
		for(int i=0; i<idades.length;i++) {
			if(idades[i]>35) {
				cont++;
				System.out.println("Idade " + i + " superior a 35 anos: " + idades[i]);
			}
		}
		System.out.println("Total: " + cont);
	}

}
