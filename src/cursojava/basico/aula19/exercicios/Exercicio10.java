package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

//		10. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
//		mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
//		ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
//		seja: B[i] := A[i] % 2.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		for(int i = 0; i<vetorA.length;i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor A: ");
			vetorA[i]=scan.nextInt();
		}
		for(int i = 0; i<vetorB.length;i++) {
			vetorB[i]=vetorA[i]%2;
			System.out.println("valor da posição " + i + " do Vetor B: " + vetorB[i]);
		}
		
	}

}
