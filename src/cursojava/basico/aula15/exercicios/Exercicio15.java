package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

//		15. Faça um Programa que peça os 3 lados de um triângulo. O programa
//		deverá informar se os valores podem ser um triângulo. Indique, caso
//		os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
//		escaleno.
//		o Dicas:
//		o Três lados formam um triângulo quando a soma de quaisquer
//		dois lados for maior que o terceiro;
//		o Triângulo Equilátero: três lados iguais;
//		o Triângulo Isósceles: quaisquer dois lados iguais;
//		o Triângulo Escaleno: três lados diferentes;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o lado 1 do triangulo: ");
		double l1 = scan.nextDouble();
		System.out.print("Informe o lado 2 do triangulo: ");
		double l2 = scan.nextDouble();
		System.out.print("Informe o lado 3 do triangulo: ");
		double l3 = scan.nextDouble();
		
		if (l1+l2>l3 || l2+l3>l1 || l3+l1>l2) {
			if (l1==l2 && l1==l3) {
				System.out.println("É um triângulo EQUILÁTERO!");
			} else if (l1==l2 || l2==l3 || l3==l1) {
				System.out.println("É um triângulo ISÓSCELES!");
			} else {
				System.out.println("É um triângulo ESCALENO!");
			}
		} else {
			System.out.println("Não é um triângulo!");
		}
	}

}
