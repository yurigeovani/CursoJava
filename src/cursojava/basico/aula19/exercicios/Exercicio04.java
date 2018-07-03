package cursojava.basico.aula19.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

//		4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
//		mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
//		raiz quadrada do respectivo elemento de A, ou seja:
//		B[i] = sqrt(A[i]).
		
		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		for(int i = 0; i<vetorA.length;i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor A: ");
			vetorA[i]=scan.nextInt();
			vetorB[i]=Math.sqrt(vetorA[i]);
		}
		for(int i = 0; i<vetorB.length;i++) {
			System.out.println("Valor da posição " + i + " do Vetor B: " + df.format(vetorB[i]));
		}

	}

}
