package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
//		22. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
//					    Até 5 Kg 			Acima de 5 Kg
//			Morango     R$ 2,50 por Kg 		R$ 2,20 por Kg
//			Maçã 	    R$ 1,80 por Kg 		R$ 1,50 por Kg
//			Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
//			compra ultrapassar R$ 25,00, receberá ainda um desconto de
//			10% sobre este total. Escreva um algoritmo para ler a
//			quantidade (em Kg) de morangos e a quantidade (em Kg) de
//			maças adquiridas e escreva o valor a ser pago pelo cliente.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a quantidade (em Kg) de morango: ");
		double qtdmorango = scan.nextDouble();
		System.out.print("Informe a quantidade (em Kg) de maçã: ");
		double qtdmaca = scan.nextDouble();
		
		double vlrmorango = 0;
		double vlrmaca = 0;
		double vlrtotal = 0;
		
		if (qtdmorango<=5) {
			vlrmorango = qtdmorango * 2.5;
		} else {
			vlrmorango = qtdmorango * 2.20;
		}
		if (qtdmaca<=5) {
			vlrmaca = qtdmaca * 1.8;
		} else {
			vlrmaca = qtdmaca * 1.5;
		} 
				
		if (vlrmorango + vlrmaca>25 | qtdmaca + qtdmorango>8) {
			vlrtotal = vlrmorango+vlrmaca;
			vlrtotal = vlrtotal - (vlrtotal*10/100);
		} else {
			vlrtotal = vlrmorango+vlrmaca;
		}
		
		System.out.println("Morango: R$ " + vlrmorango);
		System.out.println("Maçã: R$ " + vlrmaca);
		System.out.println("Total: R$ " + vlrtotal);

	}

}
