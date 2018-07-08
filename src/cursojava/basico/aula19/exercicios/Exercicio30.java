package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {

//		30. Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
//		que nos vetores B e C serão armazenados o valores pares e ímpares de
//		A, respectivamente.
		
		Scanner scan = new Scanner(System.in);
		
		int vetorA[] = new int[20];
		int countPar=0;
		int countImpar=0;
		int iVetorPar = 0;
		int iVetorImpar = 0;
		
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor A: ");
			vetorA[i]=scan.nextInt();
			
			if(vetorA[i]%2==0) {
				countPar++;
			} else {
				countImpar++;
			}
		}
		
		int[] vetorB = new int[countPar];
		int[] vetorC = new int[countImpar];
		
		for(int i=0; i<vetorA.length; i++) {
			if(vetorA[i]%2==0) {
				for(int j=iVetorPar; j<countPar; j++) {
					vetorB[iVetorPar]=vetorA[i];
					iVetorPar++;
					break;
				}
			} else {
				for(int j=iVetorImpar; j<countImpar; j++) {
					vetorC[iVetorImpar]=vetorA[i];
					iVetorImpar++;
					break;
				}
			}
		}
		
		for(int i=0; i<vetorB.length; i++) {
			System.out.println("O valor da posição " + i + " do Vetor Par: " + vetorB[i]);
		}

		for(int i=0; i<vetorC.length; i++) {
			System.out.println("O valor da posição " + i + " do Vetor Ímpar: " + vetorC[i]);
		}
}

}
