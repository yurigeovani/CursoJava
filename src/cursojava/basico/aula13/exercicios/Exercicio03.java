package cursojava.basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		//3. Faça um Programa que peça dois números e imprima a soma.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Informe o segundo número: ");
		int num2 = scan.nextInt();
		
		System.out.print("A soma dos número é: " + (num1 + num2));
	}

}
