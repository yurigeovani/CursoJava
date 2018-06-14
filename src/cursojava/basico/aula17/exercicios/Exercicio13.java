package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

//		13. Faça um programa que peça dois números, base e expoente, calcule e
//		mostre o primeiro número elevado ao segundo número. Não utilize a
//		função de potência da linguagem.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a base: ");
		int base = scan.nextInt();
		System.out.print("Informe o expoente: ");
		int expoente = scan.nextInt();
		
		int potencia = base;
		
		for (int i=2; i<=expoente; i++) {
			potencia=potencia*base;
		}
		System.out.println(base + " elevado à " + expoente + " = " + potencia);
	}

}
