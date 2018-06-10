package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

//		1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma
//		mensagem caso o valor seja inválido e continue pedindo até que o
//		usuário informe um valor válido.

		Scanner scan = new Scanner(System.in);
		boolean validaNota = false;
		
		do {
			System.out.print("Informe uma nota entre 0-10: ");
			double nota = scan.nextDouble();
			
			if (nota>=0 && nota<=10) {
				validaNota = true;
				System.out.println("A nota é " + nota);
			} else {
				System.out.println("Entre com uma nota válida!");
			}
		} while(!validaNota);
		
	}

}
