package cursojava.basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

//		12. Tendo como dados de entrada a altura de uma pessoa, construa um
//		algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
//		(72.7*altura) - 58
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		double altura = scan.nextDouble();
		
		System.out.println("Seu peso ideal é: " + (72.7*altura-58));
	}

}
