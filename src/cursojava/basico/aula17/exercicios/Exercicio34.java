package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {

//		34. Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que
//				calcule o valor de H com N termos.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Informe o termo: ");
		double termo = scan.nextDouble();
		
		double quociente = 0;
		double soma = 1;
		double i = 0;
		
		System.out.print("1");

		for (i = 2; i<=termo; i++) {
			quociente = 1/i;
			System.out.print(" + 1/" + i);
			soma+=quociente;
		}
		
		System.out.println(" = " + soma);
	}

}
