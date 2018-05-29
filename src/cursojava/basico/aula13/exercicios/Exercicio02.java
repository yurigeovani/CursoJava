package cursojava.basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		//2. Faça um Programa que peça um número e então mostre a mensagem "O número informado foi [número]".
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.print("Informe um número: ");
		int numero = scan.nextInt();
		
		System.out.println("O número informado foi " + numero);
		
		
		
	}

}
