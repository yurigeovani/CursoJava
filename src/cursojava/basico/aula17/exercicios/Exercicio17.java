package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

//		17. Faça um programa que calcule o fatorial de um número inteiro
//		fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Informe um número: ");
		int numero = scan.nextInt();
		int fatorial = 1;
		
		System.out.print(numero + "!=");
		for (int i = numero; i >=1; i--) {
			System.out.print(i + "x");
			fatorial *=i;

		}
		System.out.println("=" + fatorial);
	}

}
