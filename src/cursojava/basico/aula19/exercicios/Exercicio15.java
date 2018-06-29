package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

//		15. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
//		que defina o percentual de elementos pares e ímpares,
//		respectivamente, armazenados neste vetor.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = new int[10];
		double par = 0;
		double impar =0;
		
		for(int i=0;i<vetor.length;i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor: ");
			vetor[i]=scan.nextInt();
		}
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]%2==0) {
				par++;
				System.out.println("Valor da posição " + i + " do Vetor PAR: " + vetor[i]);
			} else {
				impar++;
				System.out.println("Valor da posição " + i + " do Vetor ÍMPAR: " + vetor[i]);
			}
		}
		System.out.println("PAR: " + (par*100/vetor.length) + "%");
		System.out.println("ÍMPAR: " + (impar*100/vetor.length) + "%");
	}

}
