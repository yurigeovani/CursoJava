package cursojava.basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

//		11. Faça um Programa que peça 2 números inteiros e um número real.
//		Calcule e mostre:
//		a. o produto do dobro do primeiro com metade do segundo .
//		b. a soma do triplo do primeiro com o terceiro.
//		c. o terceiro elevado ao cubo.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe dois números inteiros e um real: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		double num3 = scan.nextDouble();
		
		System.out.println("a) " + ((num1*2)*(num2/2)));
		System.out.println("b) " + ((num1*3)+num3));
		System.out.println("c) " + Math.pow(num3, 3));
	}

}
