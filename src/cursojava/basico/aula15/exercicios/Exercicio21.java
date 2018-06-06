package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

//		21. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//		. Álcool:
//		a. até 20 litros, desconto de 3% por litro
//		b. acima de 20 litros, desconto de 5% por litro
//		Gasolina:
//		c. até 20 litros, desconto de 4% por litro
//		d. acima de 20 litros, desconto de 6% por litro 
//		Escreva um algoritmo que leia o número de litros vendidos, o tipo de
//		combustível (codificado da seguinte forma: A-álcool, G-
//		gasolina), calcule e imprima o valor a ser pago pelo cliente	
//		sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
//		do litro do álcool é R$ 1,90.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o combustível (A-álcool | G-gasolina): ");
		String combustivel = scan.next();
		System.out.print("Informe a quantidade de litros: ");
		double litro = scan.nextDouble();
		
		double valor = 0;
		double alcool = 1.90;
		double gasolina = 2.50;
		
		if (combustivel.equalsIgnoreCase("A")) {
			if (litro<=20) {
				valor = litro*(alcool-(alcool*3/100));
				System.out.println("Valor a ser pago: R$ " + valor);
			} else {
				valor = litro*(alcool-(alcool*4/100));
				System.out.println("Valor a ser pago: R$ " + valor);
			}
		} else if (combustivel.equalsIgnoreCase("G")) {
			if (litro<=20) {
				valor = litro*(gasolina-(gasolina*3/100));
				System.out.println("Valor a ser pago: R$ " + valor);
			} else {
				valor = litro*(gasolina-(gasolina*4/100));
				System.out.println("Valor a ser pago: R$ " + valor);
			}

		} else {
			System.out.println("Informe um combustível válido!");
		}
	}

}
