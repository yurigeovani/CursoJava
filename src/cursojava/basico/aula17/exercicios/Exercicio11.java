package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

//		11. Altere o programa anterior para mostrar no final a soma dos números.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int num1 = scan.nextInt();
		System.out.print("Informe o segundo número: ");
		int num2 = scan.nextInt();
		
		int soma = 0;
		
		for (int i = num1; i<=num2; i++) {
			System.out.println("O número é " + i);
			
			soma+=i;
		}

		System.out.println("Soma = " + soma);
	}

}
