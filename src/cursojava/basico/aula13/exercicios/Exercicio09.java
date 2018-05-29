package cursojava.basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

//		9. Faça um Programa que peça a temperatura em graus Farenheit,
//		transforme e mostre a temperatura em graus Celsius.
//		C = (5 * (F-32) / 9).

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Farenheit: ");
		double temperatura = scan.nextDouble();
		
		System.out.println("A tempera tura em Celsius é: " + (5*(temperatura-32)/9));
	}

}
