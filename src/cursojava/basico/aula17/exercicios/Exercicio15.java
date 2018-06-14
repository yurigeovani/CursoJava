package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

//		15. A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... 
//		Faça um programa capaz de gerar a série até o n-ésimo termo.
		
		Scanner scan = new Scanner (System.in);
		
		int soma = 0;
		int termo = 0;
		
		System.out.print("Informe o termo: ");
		termo = scan.nextInt();
		
		for(int i=1;i<=termo;i++) {
			soma = soma + termo;
			System.out.print(soma + ", ");
		}
	}

}
