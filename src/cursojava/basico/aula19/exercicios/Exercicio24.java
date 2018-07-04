package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

//		24. Números palíndromos são aqueles que escritos da direita para a
//		esquerda têm o mesmo valor quando escritos da esquerda para a
//		direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
//		programa que verifique se um dado vetor A de 10 elementos inteiros é
//		um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
//		último, se o segundo elemento do vetor é igual ao penúltimo e assim
//		por diante até verificar todos os elementos ou chegar a conclusão que
//		o vetor não é um palíndromo.
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = new int[10];
		boolean flag = true;
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Informe o valor da posição " + i + ": ");
			vetor[i]=scan.nextInt();
		}
		
		for(int i=0; i<(vetor.length/2);i++) {
			if(vetor[i]!=vetor[vetor.length-1-i]) {
				flag=false;
			}
		}
		
		if(flag) {
			System.out.println("É palíndromo!");
		} else {
			System.out.println("Não é palíndromo!");
		}		
	}

}