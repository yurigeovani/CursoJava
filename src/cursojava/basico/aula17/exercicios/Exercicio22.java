package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

//		22. Faça um programa que calcule o valor total investido por um
//		colecionador em sua coleção de CDs e o valor médio gasto em cada
//		um deles. O usuário deverá informar a quantidade de CDs e o valor
//		para em cada um.
		
		Scanner scan = new Scanner (System.in);
		
		int qtdCDs = 0;
		double valorCD, totalCDs = 0;

		System.out.print("Informe a quantidade de CDs: ");
		qtdCDs = scan.nextInt();
		
		for (int i = 1; i<=qtdCDs; i++) {
			System.out.print("Informe o valor do CD " + i + ": ");
			valorCD = scan.nextDouble();
			totalCDs+=valorCD;
 		}
		
		System.out.println("Total de CDs comprados: " + qtdCDs);
		System.out.println("Valor total dos CDs: R$ " + totalCDs);
		System.out.println("O valor médio dos CDs: R$ " + (totalCDs/qtdCDs));
	}

}
