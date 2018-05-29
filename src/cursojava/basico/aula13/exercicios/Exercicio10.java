package cursojava.basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

//		10. Faça um Programa que peça a temperatura em graus Celsius,
//		transforme e mostre em graus Farenheit.
//		C = (5 * (F-32) / 9).
//		℉ = ℃ * 1,8 + 32.00
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em graus Celsius: ");
		double temperatura = scan.nextDouble();
		
		System.out.print("A temperatura em Farenheit é: " + (temperatura*1.8 + 32));
		
	}

}
