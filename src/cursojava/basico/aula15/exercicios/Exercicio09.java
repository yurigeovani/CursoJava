package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

//		9. Faça um Programa que leia três números e mostre-os em ordem
//		decrescente.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o número 1: ");
		double num1 = scan.nextDouble();
		System.out.print("Informe o número 2: ");
		double num2 = scan.nextDouble();
		System.out.print("Informe o número 3: ");
		double num3 = scan.nextDouble();
		
		if (num1<num2 && num1<num3) {
			if (num2<num3) {
				System.out.println("Números decrescente: num3 " + num3 + ", num2 " + num2 + ", num1 " + num1);
			} else {
				if(num2==num3) {
					System.out.println("Números decrescente: num2 = num3: " + num2 + ", num1 " + num1);
				} else {
					System.out.println("Números decrescente: num2 " + num2 + ", num3 " + num3 + ", num1 " + num1);
				}
			}

		} else if (num2<num3 && num2<num1) {
			if (num3<num1) {
				System.out.println("Números decrescente: num1 " + num1 + ", num3 " + num3 + ", num2 " + num2);
			} else {
				if(num1==num3) {
					System.out.println("Números decrescente: num1 = num3: " + num1 + ", num2 " + num2);
				} else {
					System.out.println("Números decrescente: num3 " + num3 + ", num1 " + num1 + ", num2 " + num2);
				}
			}
		} else if (num3<num1 && num3<num2) {
			if (num1<num2) {
				System.out.println("Números decrescente: num2 " + num2 + ", num1 " + num1 + ", num3 " + num3);
			} else {
				if(num1==num2) {
					System.out.println("Números decrescente: num1 = num2: " + num1 + ", num3 " + num3);
				} else {
					System.out.println("Números decrescente: num1 " + num1 + ", num2 " + num2 + ", num3 " + num3);
				}
			}
		} else if(num1==num2) {
			if (num1<num3) {
				System.out.println("Números decrescente: num3 " + num3 + ", num1 = num2: " + num1);
			} else if (num3<num1){
				System.out.println("Números decrescente: num1 = num2: " + num1 + ", num3 " + num3);
			}
		} else if (num1==num3) {
			if (num1<num2) {
				System.out.println("Números decrescente: num2 " + num2 + ", num1 = num3: " + num3);
			} else {
				System.out.println("Números decrescente: num1 = num3: " + num1 + ", num2 " + num2);
			}
		} else if (num2==num3) {
			if (num2<num1) {
				System.out.println("Números decrescente: num1 " + num1 + ", num2 = num3: " + num2);
			} else {
				System.out.println("Números decrescente: num2 = num3: " + num2 + ", num1 " + num1);
			}
		} else {
			System.out.println("Todos os números são iguais: " + num1);
		}

	}

}