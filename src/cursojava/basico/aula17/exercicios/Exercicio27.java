package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {

//		27.O Departamento Estadual de Meteorologia lhe contratou para
//		desenvolver um programa que leia as um conjunto indeterminado de
//		temperaturas, e informe ao final a menor e a maior temperaturas
//		informadas, bem como a média das temperaturas.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Informe a quantidade de temperaturas: ");
		int qtdTemp = scan.nextInt();
		
		double temp = 0;
		double tempMaior = Double.MIN_VALUE;
		double tempMenor = Double.MAX_VALUE;
		double tempTotal = 0;
		
		for (int i = 1; i<=qtdTemp; i++) {
			System.out.print("Informe a temperatura " + i + ": ");
			temp = scan.nextDouble();
			tempTotal +=temp;
			if (temp<tempMenor) {
				tempMenor = temp;
			} else if (temp>tempMaior) {
				tempMaior = temp;
			}
		}
		
		System.out.println("Temperatura maior: " + tempMaior);
		System.out.println("Temperatura menor: " + tempMenor);
		System.out.println("Média de temperatura: " + (tempTotal/qtdTemp));
	}

}