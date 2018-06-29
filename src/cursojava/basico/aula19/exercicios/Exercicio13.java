package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

//		13. Criar um vetor A com 10 elementos inteiros. Implementar um programa
//		que determine a soma dos elementos armazenados neste vetor que
//		são múltiplos de 5.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int soma = 0;
		
		for(int i=0;i<vetor.length;i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor: ");
			vetor[i]=scan.nextInt();
		}
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]%5==0) {
				System.out.println("Valor da posição " + i + " do Vetor é múltiplo de 5: " + vetor[i]);
				soma+=vetor[i];
			}
		}
		System.out.println("Total de elementos múltiplos de 5 = " + soma);
	}

}
