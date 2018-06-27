package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

//		2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
//		mesmo tipo e tamanho e com os elementos do vetor A multiplicados
//		por 2, ou seja: B[i] = A[i] * 2.
		
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i<vetorA.length;i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor A: ");
			vetorA[i]=scan.nextInt();
			vetorB[i]=vetorA[i]*2;
		}
		for(int i = 0; i<vetorB.length;i++) {
			System.out.println("Valor da posição " + i + " do Vetor B: " + vetorB[i]);
		}

	}

}
