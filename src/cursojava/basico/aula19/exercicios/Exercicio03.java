package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

//		3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
//		mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
//		ser o quadrado do respectivo elemento de A, ou seja:
//		B[i] = A[i] * A[I].
		
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for (int i = 0; i<vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor A: ");
			vetorA[i]=scan.nextInt();
			//vetorB[i]=vetorA[i]*vetorA[i];
			vetorB[i]=Math.pow(vetorA[i], 2);
		}
		for(int i = 0; i<vetorB.length;i++) {
			System.out.println("Valor da posição " + i + " do Vetor B: " + vetorB[i]);
		}
		
	}

}
