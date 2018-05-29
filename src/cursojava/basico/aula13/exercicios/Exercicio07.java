package cursojava.basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		//7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do lado do quadrado: ");
		double lado = scan.nextDouble();
		double area = Math.pow(lado, 2);
		
		System.out.println("A área do quadrado é: " + area);
		System.out.println("O dobro desta área é: " + area * 2);
	}

}
