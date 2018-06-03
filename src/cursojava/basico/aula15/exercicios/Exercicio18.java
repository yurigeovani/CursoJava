package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

//		18. Faça um Programa que peça um número inteiro e determine se ele é
//		par ou impar. Dica: utilize o operador módulo (resto da divisão).
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int numero = scan.nextInt();
		
		if(numero%2==0) {
			System.out.println("Número PAR!");
		} else {
			System.out.println("Número ÍMPAR!");
		}
	}

}
