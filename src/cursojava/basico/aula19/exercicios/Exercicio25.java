package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {

//		25. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
//		mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
//		a) B i deverá receber 1 quando Ai for par; 
//		b) B i deverá receber 0 quando Ai for ímpar.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor A: ");
			vetorA[i]=scan.nextInt();
		}
		
		for(int i=0; i<vetorB.length; i++) {
			if(vetorA[i]%2==0) {
				vetorB[i]=1;
			} else {
				vetorB[i]=0;
			}
			// Operador Ternário:
			// vetorB[i] = (vetorA[i] % 2 == 0) ? 1:0;
			// vetorB recebe: if(vetorA[i]%2==0, recebe 1, se ñ, recebe 0
		}
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Valor da posição " + i + " do Vetor B: " + vetorB[i]);
		}
	}

}
