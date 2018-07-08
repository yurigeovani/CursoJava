package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {

//		37. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
//		mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial
//		do elemento correspondente em A.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor A: ");
			vetorA[i]=scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			vetorB[i]=1;
			System.out.print("Fatorial de " + vetorA[i] + "! = ");
			for(int j=vetorA[i]; j>1; j--) {
				vetorB[i]*=j;
				System.out.print(j + " * ");
			}
			System.out.print("1 = " + vetorB[i]);
			System.out.println("");
		}
	}

}
