package cursojava.basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		//4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a nota 1: ");
		double n1 = scan.nextDouble();
		System.out.print("Informe a nota 2: ");
		double n2 = scan.nextDouble();
		System.out.print("Informe a nota 3: ");
		double n3 = scan.nextDouble();
		System.out.print("Informe a nota 4: ");
		double n4 = scan.nextDouble();
		
		System.out.print("A média é: " + ((n1+n2+n3+n4)/4));
	}

}
