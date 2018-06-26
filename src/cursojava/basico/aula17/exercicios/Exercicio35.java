package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {

//		35. Faça um programa que mostre os n termos da Série a seguir:
//			S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
//			Imprima no final a soma da série.
			
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o termo: ");
		double termo = scan.nextDouble();
		
		double quociente = 0;
		double somaQuociente = 1;
		double divisor = 1;
		double i = 0;
		
		System.out.print("S = 1.0/1.0");
		for (i = 2; i<=termo;i++) {
			divisor += 2;
			quociente = i/divisor;
			System.out.print(" + " + i + "/" + divisor);
			somaQuociente+=quociente;
		}
		System.out.print(" = " + somaQuociente);
		
	}

}
