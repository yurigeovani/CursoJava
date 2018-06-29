package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

//		9. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
//		um vetor C, onde cada elemento de C é a divisão dos respectivos
//		elementos em A e B, ou seja:
//		C[i] = A[i] / float(B[i]).
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		double[] vetorC = new double[10];
		
		for(int i = 0; i<vetorA.length;i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor A: ");
			vetorA[i]=scan.nextInt();
		}
		for(int i = 0;i<vetorB.length;i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor A: ");
			vetorB[i]=scan.nextInt();
		}
		for(int i = 0;i<vetorC.length;i++) {
			vetorC[i]=vetorA[i]/vetorB[i];
			System.out.println("Valor da posição " + i + " do Vetor C: " + vetorA[i] + " / " + vetorB[i] + " = " + vetorC[i]);
		}
	}

}
