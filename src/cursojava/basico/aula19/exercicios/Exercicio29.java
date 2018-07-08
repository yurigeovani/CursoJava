package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {

//		29. Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
//		sendo este a junção dos dois outros vetores. Os primeiros 10
//		elementos de C deverão receber os elementos de A e os últimos
//		elementos C deverão receber os elementos de B. Desta forma, C
//		deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[vetorA.length+vetorB.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor A: ");
			vetorA[i]=scan.nextInt();
		}
		
		for(int i=0; i<vetorB.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor B: ");
			vetorB[i]=scan.nextInt();
		}
		
		for(int i=0; i<vetorC.length; i++) {
			if(i<vetorA.length) {
				vetorC[i]=vetorA[i];
			} else {
				vetorC[i]=vetorB[i-vetorA.length];
			}
			System.out.println("O valor da posição " + i + " do Vetor C: " + vetorC[i]);
		}
		
	}

}
