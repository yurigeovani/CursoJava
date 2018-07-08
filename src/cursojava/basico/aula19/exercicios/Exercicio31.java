package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args){

//		31. Ler um vetor A com 20 elementos. Separar os elementos pares e
//		ímpares de A utilizando apenas um vetor extra B. Sugestão: no início
//		do vetor B armazene os elementos pares de A e nas posições
//		restantes do vetor B armazene os elementos de A que são ímpares.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int posB = 0;
		
		for (int i=0; i<vetorA.length; i++){
			System.out.print("Informe o valor da posição " + i + " do Vetor A: ");
			vetorA[i]=scan.nextInt();			
		}
				
		for (int i=0; i<vetorA.length; i++){
			if (vetorA[i] % 2 == 0){
				vetorB[posB] = vetorA[i];
				posB++;
			} 
		}
		
		for (int i=0; i<vetorA.length; i++) {
			if(vetorA[i]%2!=0) {
				vetorB[posB]=vetorA[i];
				posB++;
			}
		}
		
		for (int i=0; i<vetorB.length; i++) {
			System.out.println("O valor da posição " + i + " do Vetor: " + vetorB[i]);
		}
		
	}

}