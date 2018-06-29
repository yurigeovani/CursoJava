package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

//		16. Criar um vetor A com 10 elementos inteiros. Escrever um programa
//		que calcule e escreva: a) a soma de elementos armazenados neste
//		vetor que são inferiores a 15; b) a quantidade de elementos
//		armazenados no vetor que são iguais a 15; e c) a média dos
//		elementos armazenados no vetor que são superiores a 15.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetor=new int[10];
		int soma=0;
		int iguais=0;
		double media=0;
		
		for(int i=0;i<vetor.length;i++) {
			System.out.print("Informe o valor da posição " + i + " do Vetor: ");
			vetor[i]=scan.nextInt();
		}
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i]<15) {
				soma+=vetor[i];
				System.out.println("Valor da posição " + i + " menor que 15: " + vetor[i]);
			} else if(vetor[i]==15) {
				iguais++;
				System.out.println("Valor da posição " + i + " igual a 15: " + vetor[i]);
			} else {
				media+=vetor[i];
				System.out.println("Valor da posição " + i + " maior que 15: " + vetor[i]);
			}
		}
		System.out.println("Soma de elementos menor que 15: " + soma);
		System.out.println("Quantidade de elementos iguais a 15: " + iguais);
		System.out.println("Média de elementos superior a 15: " + (media/vetor.length));		
	}

}
