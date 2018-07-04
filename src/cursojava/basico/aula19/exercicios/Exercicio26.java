package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {

//		26. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
//		um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
//		regras de formação: 
//		a) Ci deverá receber 1 quando Ai for maior que Bi;
//		b) Ci deverá receber 0 quando Ai for igual a Bi; 
//		c) Ci deverá receber -1 quando A i for menor que B i .
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor A: ");
			vetorA[i]=scan.nextInt();
			System.out.print("Informe o valor da posição " + i + " do Vetor B: ");
			vetorB[i]=scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			if(vetorA[i]>vetorB[i]) {
				vetorC[i]=1;
			} else if(vetorA[i]==vetorB[i]) {
				vetorC[i]=0;
			} else {
				vetorC[i]=-1;
			}
			System.out.println("Valor da posição " + i + " do Vetor C: " + vetorC[i]);
		}
		
	}

}
