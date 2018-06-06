package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

//		23. O Hipermercado Tabajara está com uma promoção de carnes que é
//		imperdível. Confira:
//					Até 5 Kg		Acima de 5 Kg
//		File Duplo 	R$ 4,90 por 	Kg R$ 5,80 por Kg
//		Alcatra 	R$ 5,90 por Kg 	R$ 6,80 por Kg
//		Picanha 	R$ 6,90 por Kg 	R$ 7,80 por Kg
//		Para atender a todos os clientes, cada cliente poderá levar
//		apenas um dos tipos de carne da promoção, porém não há
//		limites para a quantidade de carne por cliente. Se compra for
//		feita no cartão Tabajara o cliente receberá ainda um desconto
//		de 5% sobre o total da compra. Escreva um programa que peça
//		o tipo e a quantidade de carne comprada pelo usuário e gere
//		um cupom fiscal, contendo as informações da compra: tipo e
//		quantidade de carne, preço total, tipo de pagamento, valor do
//		desconto e valor a pagar.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tipos de carne: ");
		System.out.println("1) Filé Duplo");
		System.out.println("2) Alcatra");
		System.out.println("3) Picanha");
		System.out.print("Escolha a carne: ");
		int idCarne = scan.nextInt();
		System.out.print("Informe a quantidade: ");
		double qtd = scan.nextDouble();
		
		double valor = 0;
		String carne = "carne";
		double desconto = 0;
		double total = 0;
		
		switch (idCarne) {
		case 1: 
			if (qtd>5) {
				valor = qtd * 5.8;
			} else {
				valor = qtd * 4.9;
			}
			carne = "Filé Duplo!";
			break;
		case 2:
			if (qtd>5) {
				valor = qtd * 6.8;
			} else {
				valor = qtd * 5.9;
			}
			carne = "Alcatra!";
			break;
		case 3:
			if (qtd>5) {
				valor = qtd * 7.8;
			} else {
				valor = qtd * 6.9;
			}
			carne = "Picanha!";
			break;
		default: System.out.println("Informe uma carne válida!");
		}
		
		System.out.println("################# CUPOM #################");
		System.out.println(carne + " " + qtd + "Kg = R$ " + valor);
		System.out.println("SUBTOTAL = R$ " + valor);
		System.out.print("Utilizará o Cartão Tabajara (S/N)? ");
		String cartao = scan.next();
		
		if (cartao.equalsIgnoreCase("S")) {
			desconto = valor*5/100;
			total = valor - desconto;
			System.out.println("Total = R$ " + total);
		} else {
			total = valor;
			System.out.println("Total = R$ " + total);
		}
	}

}
