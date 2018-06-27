package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

//		1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
//		mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
//		seja, B[i] = A[i].
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i<vetorA.length;i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor A: ");
			vetorA[i] = scan.nextInt();
			vetorB[i]=vetorA[i];
		}
		for(int i = 0; i<vetorB.length;i++) {
			System.out.println("Valor da posição " + i + " do Vetor B: " + vetorB[i]);
		}
		
	}

}