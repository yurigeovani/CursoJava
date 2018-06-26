package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

//		5. Altere o programa anterior permitindo ao usuário informar as
//		populações e as taxas de crescimento iniciais. Valide a entrada e
//		permita repetir a operação.
		
		Scanner scan = new Scanner (System.in);
		
		int paisA = 0;
		int paisB = 0;
		double taxaA = 0;
		double taxaB = 0;
		int anos = 0;
		
		boolean validacao = false;
		
		while (!validacao) {
			System.out.print("Informe a população do País A: ");
			paisA = scan.nextInt();
			
			if(paisA>0) {
				validacao = true;
			} else {
				System.out.println("Informe uma quantidade de população válida!");
			}
		}
		
		validacao = false;
		while (!validacao) {
			System.out.print("Informe a população do País B: ");
			paisB = scan.nextInt();
			
			if(paisB>0) {
				validacao = true;
			} else {
				System.out.println("Informe uma quantidade de população válida!");
			}
		}

		validacao = false;
		while (!validacao) {
			System.out.print("Informe a taxa de crescimento do país A: ");
			taxaA = scan.nextDouble();
			
			if(taxaA>0) {
				validacao = true;
			} else {
				System.out.println("Informe uma taxa válida!");
			}
		}

		validacao = false;
		while (!validacao) {
			System.out.print("Informe a taxa de crescimento do país B: ");
			taxaB = scan.nextDouble();
			
			if(taxaB>0) {
				validacao = true;
			} else {
				System.out.println("Informe uma taxa válida!");
			}
		}

		
			while(paisA<paisB) {
				paisA += paisA/100*taxaA;
				paisB += paisB/100*taxaB;
				anos++;
			}


		System.out.println("População A: " + paisA);
		System.out.println("População B: " + paisB);
		System.out.println("Quantidade de anos: " + anos);

	}

}
