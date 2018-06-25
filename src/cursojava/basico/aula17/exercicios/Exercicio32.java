package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		
//		32. O cardápio de uma lanchonete é o seguinte:
//			Especificação		Código	Preço
//			Cachorro Quente   	100		R$ 1,20
//			Bauru Simples		101		R$ 1,30
//			Bauru com ovo 		102		R$ 1,50
//			Hambúrguer 			103		R$ 1,20
//			Cheeseburguer		104		R$ 1,30
//			Refrigerante		105		R$ 1,00
//			Faça um programa que leia o código dos itens pedidos e as
//			quantidades desejadas. Calcule e mostre o valor a ser pago por
//			item (preço * quantidade) e o total geral do pedido. Considere
//			que o cliente deve informar quando o pedido deve ser encerrado.
		
		Scanner scan = new Scanner (System.in);
		
		int codProd = 1;
		String descProd = "";
		double vlrProd = 0;
		double vlrTotalProd=0;
		double subTotal = 0;
		double vlrTotalPedido = 0;
		double qtdProd = 0;
		
		for(int i = 1; codProd!=0;i++) {
			System.out.print("Informe o item (0 para FINALIZAR): ");
			codProd = scan.nextInt();
			if(codProd!=0) {
				switch(codProd) {
				case 100:
					descProd = "Cachorro Quente";
					vlrProd = 1.20;
					break;
				case 101:
					descProd = "Bauru simples";
					vlrProd = 1.30;
					break;
				case 102:
					descProd = "Bauru com ovo";
					vlrProd = 1.50;
					break;
				case 103:
					descProd = "Hambúrguer";
					vlrProd = 1.20;
					break;
				case 104:
					descProd = "Cheeseburguer";
					vlrProd = 1.30;
					break;
				case 105:
					descProd = "Refrigerante";
					vlrProd = 1;
					break;
				}
				
				System.out.print("Informe a quantidade do item: ");
				qtdProd = scan.nextDouble();
				
				vlrTotalProd = vlrProd*qtdProd;
				subTotal+=vlrTotalProd;
				
				System.out.print(i + ") " + descProd + " * " + qtdProd);
				System.out.println(" = R$ " + (vlrTotalProd));
				System.out.println("Subtotal R$ " + subTotal);
				
				vlrTotalProd = 0;

			}

			}
		
		vlrTotalPedido = subTotal;
		System.out.println("Valor total à ser pago: R$ " + vlrTotalPedido);
	}

}