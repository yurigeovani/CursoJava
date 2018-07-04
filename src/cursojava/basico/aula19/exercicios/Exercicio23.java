package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

//		23. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
//		que verifique se "todos" os elementos do vetor A são pares. Se pelo
//		menos um elemento do vetor não for par o processo de repetição para
//		percorrer os elementos do vetor deve ser encerrado, como sugestão:
//		utilize uma variável do tipo flag para atingir este propósito.

		
		Scanner scan = new Scanner(System.in);
	
		int[] vetor = new int[10];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Informe o valor da posição " + i + ": ");
			vetor[i] = scan.nextInt();
			
			if(vetor[i]%2!=0) {
				System.out.println(vetor[i] + " é ímpar! O processo será encerrado!");
				break;
			}
		}
	}

}
