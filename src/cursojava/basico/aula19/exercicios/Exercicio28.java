package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {

//		28. Ler um vetor A com 10 elementos e construir um vetor B de mesmo
//		tipo e tamanho e com os mesmos elementos de A, sendo que estes
//		deverão estar invertidos, ou seja, o primeiro elemento de A passa a
//		ser o último de B, o segundo elemento de A passa a ser o penúltimo
//		de B e assim por diante.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor A: ");
			vetorA[i]=scan.nextInt();
			
			vetorB[vetorA.length - i -1]=vetorA[i];
		}
				
		for(int i=0; i<vetorB.length; i++) {
			System.out.println("O valor da posição " + i + " do Vetor B: " + vetorB[i]);
		}
		
	}

}