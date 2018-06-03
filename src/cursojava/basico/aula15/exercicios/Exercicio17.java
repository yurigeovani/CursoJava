package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

//		17. Faça um Programa que peça um número correspondente a um
//		determinado ano e em seguida informe se este ano é ou não bissexto.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o ano: ");
		int ano = scan.nextInt();
		
		if(ano%4==0 && ano%100!=0 || ano%4==0 && ano%100==0 && ano%400==0) {
			System.out.println("Ano bissexto!");
		} else {
			System.out.println("Ano não bissexto!");
		}
	}

}
