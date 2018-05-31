package cursojava.basico.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		System.out.print("Informe a sua idade: ");
//		
//		int idade = scan.nextInt();
//		
//		if (idade >=18) {
//			System.out.println("É maior de idade.");
//		} else {
//			System.out.println("Não é maior de idade.");
//		}
		
		//valor <= 10 | barato
		//10 < valor < 15 | pedir desconto
		//15 <= valor < 17 | muito caro
		// valor >= 17 | sai fora
		
		System.out.print("Entre com o preço do item: ");
		double valor = scan.nextDouble();
		
		if (valor<=10) {
			System.out.println("Está barato, pode comprar!");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Você pode pedir um desconto!");
		} else if (valor >=15 && valor <17) {
			System.out.println("Pode pesquisar mais!");
		} else {// valor >= 17 | sai fora
			System.out.println("Sai fora!");
		}
	}

}
