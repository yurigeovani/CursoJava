package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

//		19. Faça um programa que calcule e mostre a média aritmética de N
//		notas.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de notas: ");
		double qtdnotas = scan.nextInt();
		double contador = 0;
		double nota = 0;
		
		System.out.println("informe as notas: ");
		for (int i = 1; i<=qtdnotas; i++) {
			System.out.print("Nota " + i + ": ");
			nota = scan.nextDouble();
			contador += nota;
		}
		System.out.print("Média: " + (contador/qtdnotas));
	}

}
