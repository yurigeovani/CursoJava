package cursojava.basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		//6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o raio do círculo: ");
		double r = scan.nextDouble();
		
		//Área do círculo = π*r²
		System.out.print("A área do círculo é: " + (3.14*(r*r)) + "cm");
	}

}
