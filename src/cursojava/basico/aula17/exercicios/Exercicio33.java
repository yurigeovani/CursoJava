package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {

//		33. Faça um programa que mostre os n termos da Série a seguir:
//			S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
//			Imprima no final a soma da série.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o termo: ");
		double termo = scan.nextInt();
		
		double divisor = 1;
		double quociente = 0;
		double somaQuociente = 0;
		
		for (int i = 1; i<=termo;i++) {
			quociente = i/divisor;
			System.out.println(i + " / " + divisor + " = " + quociente);
			divisor = divisor+2;
			somaQuociente += quociente;
		}
		
		System.out.println("Soma da série: " + somaQuociente);
		
	}

}