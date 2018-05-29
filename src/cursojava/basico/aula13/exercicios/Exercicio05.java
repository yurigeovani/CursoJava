package cursojava.basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		//5. Faça um Programa que converta metros para centímetros.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o tamanho em metros: ");
		double m = scan.nextDouble();
		
		System.out.print("O tamanho em centímetros é: " + (m*100) + "cm");
	}

}
