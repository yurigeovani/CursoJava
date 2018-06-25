package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {

//		26.Faça um programa que calcule o fatorial de um número inteiro
//		fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser
//		conforme o exemplo abaixo:
//		o Fatorial de: 5
//		o 5! = 5 . 4 . 3 . 2 . 1 = 120
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num = scan.nextInt();
		
		int fatorial = 1;
		
		System.out.print("Fatorial de " + num + "!= ");
		for (int i = num; i>1; i--) {
			System.out.print(i+"x");
			fatorial *=i;
		}
		System.out.println("1 = " + fatorial);
	}

}