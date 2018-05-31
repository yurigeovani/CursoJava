package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

//		2. Faça um Programa que peça um valor e mostre na tela se o valor é
//		positivo ou negativo.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		double numero = scan.nextDouble();
		
		if (numero>0) {
			System.out.println("O número é positivo!");
		} else if (numero<0) {
			System.out.println("O número é negativo!");
		} else {
			System.out.println("O número é zero!");
		}
	}

}
