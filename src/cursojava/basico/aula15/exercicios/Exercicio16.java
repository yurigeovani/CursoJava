package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

//		16. Faça um programa que calcule as raízes de uma equação do segundo
//		grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
//		b e c e fazer as consistências, informando ao usuário nas seguintes
//		situações:
//		a. Se o usuário informar o valor de A igual a zero, a equação não é
//		do segundo grau e o programa não deve fazer pedir os demais
//		valores, sendo encerrado;
//		b. Se o delta calculado for negativo, a equação não possui raizes
//		reais. Informe ao usuário e encerre o programa;
//		c. Se o delta calculado for igual a zero a equação possui apenas
//		uma raiz real; informe-a ao usuário;
//		d. Se o delta for positivo, a equação possui duas raiz reais;
//		informe-as ao usuário;

		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o valor de A: ");
		double a = scan.nextDouble();
		
		if(a==0) {
			System.out.println("A equação não é do segundo grau.");
		} else {
			System.out.print("Informe o valor de B: ");
			double b = scan.nextDouble();
			System.out.print("Informe o valor de C: ");
			double c = scan.nextDouble();
			
			double delta = Math.pow(b, 2)-4*a*c;
			
			if (delta<0) {
				System.out.println("Δ < 0. A equação não possui raízes reais!");
			} else {
				double x1 = (-b+Math.sqrt(delta))/(2*a);
				double x2 = (-b-Math.sqrt(delta))/(2*a);
				if (delta==0) {
					System.out.println("Delta igual a zero, possui apenas uma raíz: " + x1);
				} else if (delta>0) {
					System.out.println("A equação possui duas raízes: ");
					System.out.println("X' = " + x1);
					System.out.println("X\" = " + x2);
					}
				}

		}
		
	}

}