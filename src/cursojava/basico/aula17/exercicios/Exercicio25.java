package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {

//		25. O Sr. Manoel Joaquim expandiu seus negÃ³cios para alÃ©m dos
//		negÃ³cios de 1,99 e agora possui uma loja de conveniÃªncias. FaÃ§a um
//		programa que implemente uma caixa registradora rudimentar. O
//		programa deverÃ¡ receber um nÃºmero desconhecido de valores
//		referentes aos preÃ§os das mercadorias. Um valor zero deve ser
//		informado pelo operador para indicar o final da compra. O programa
//		deve entÃ£o mostrar o total da compra e perguntar o valor em dinheiro
//		que o cliente forneceu, para entÃ£o calcular e mostrar o valor do troco.
//		ApÃ³s esta operaÃ§Ã£o, o programa deverÃ¡ voltar ao ponto inicial, para
//		registrar a prÃ³xima compra. A saÃ­da deve ser conforme o exemplo
//		abaixo:
//		Lojas Tabajara
//		Produto 1: R$ 2.20
//		Produto 2: R$ 5.80
//		Produto 3: R$ 0
//		Total: R$ 9.00
//		Dinheiro: R$ 20.00
//		Troco: R$ 11.00
//		...
				
		Scanner scan = new Scanner (System.in);
		
		double vlrProduto = 1;
		double vlrTotal = 0; 
		
		System.out.println("Lojas Tabajara");
		for(int i = 1; vlrProduto > 0; i++) {
			System.out.print("Produto " + i + ": R$ ");
			vlrProduto = scan.nextDouble();
			vlrTotal += vlrProduto;
		}

		System.out.println("Total: R$ " + vlrTotal);
		System.out.print("Informe o valor em dinheiro: R$");
		double dinheiro = scan.nextDouble();
		if (dinheiro>vlrTotal) {
			System.out.println("Troco: R$" + (dinheiro-vlrTotal));
		}
	}

}