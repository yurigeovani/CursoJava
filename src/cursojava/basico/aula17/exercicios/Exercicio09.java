package cursojava.basico.aula17.exercicios;

public class Exercicio09 {

	public static void main(String[] args) {

//		9. Faça um programa que imprima na tela apenas os números ímpares
//		entre 1 e 50.
		
		for (int i = 1; i<=50; i++) {
			if(i%2==1) {
				System.out.println("O número " + i + " é ímpar.");
			}
			i++;
		}
	}

}
