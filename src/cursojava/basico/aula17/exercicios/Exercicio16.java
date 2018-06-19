package cursojava.basico.aula17.exercicios;

public class Exercicio16 {

	public static void main(String[] args) {

//		16. A série de Fibonacci é formada pela seqüência
//		0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
//		que o valor seja maior que 500.
		
		
		int anterior = 1;
		int atual = 0;
		int proximo = 0;
		
		
		System.out.println("A sequência é: ");

		while(proximo<=500){
			System.out.print(proximo + " ");
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
		}
	}

}