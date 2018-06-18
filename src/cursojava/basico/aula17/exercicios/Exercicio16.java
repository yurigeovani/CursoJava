package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

//		16. A série de Fibonacci é formada pela seqüência
//		0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
//		que o valor seja maior que 500.
		
		Scanner scan = new Scanner (System.in);
		
		int anterior = 0;
		int atual = 1;
		int proximo = 0;
		int termo = 0;
		
		
		System.out.print("Informe o termo: ");
		termo = scan.nextInt();
		
		if (termo == 0) {
			atual = 0;
			System.out.println("Para o termo " + termo + ", a sequência é: " + atual);
		} else if (termo == 1) {
			anterior = 0;
			atual = 1;
			System.out.println("Para o termo " + termo + ", a sequência é: " + anterior + ", " + atual);
		} else if (termo > 1) {
			System.out.println("Para o termo " + termo + ", a sequência é: ");
			System.out.print("0, 1");
			anterior = 0;
			atual = 1;
			for(int i=2;i<=termo;i++) {
				proximo = anterior + atual;
				System.out.print(", " + proximo);
				anterior = atual;
				atual = proximo;
			}
		} else {
			System.out.println("Informe um número maior ou igual a zero.");
		}
	}

}