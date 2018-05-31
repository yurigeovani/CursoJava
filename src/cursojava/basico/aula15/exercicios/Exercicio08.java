package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

//		8. Faça um programa que pergunte o preço de três produtos e informe
//		qual produto você deve comprar, sabendo que a decisão é sempre
//		pelo mais barato.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o preço do produto 1: ");
		double p1 = scan.nextDouble();
		System.out.print("Informe o preço do produto 2: ");
		double p2 = scan.nextDouble();
		System.out.print("Informe o preço do produto 3: ");
		double p3 = scan.nextDouble();
		
		if (p1<p2 && p1<p3) {
			System.out.println("Deve comprar o produto 1: R$" + p1);
		} else if (p2<p1 && p2<p3) {
			System.out.println("Deve comprar o produto 2: R$" + p2);
		} else if (p3<p1 && p3<p2) {
			System.out.println("Deve comprar o produto 3: R$" + p3);
		} else if (p1<p2 && p1==p3) {
			System.out.println("Produtos 1 e 3 tem mesmo preço e são mais baratos: R$" + p1);
		} else if (p2<p3 && p2==p1) {
			System.out.println("Produtos 1 e 2 tem mesmo preço e são mais baratos: R$" + p2);
		} else if (p3<p1 && p3==p2) {
			System.out.println("Produtos 2 e 3 tem mesmo preço e são mais baratos: R$" + p3);
		} else {
			System.out.println("Todos tem o mesmo preço. R$ " + p1);
		}
		
	}

}
