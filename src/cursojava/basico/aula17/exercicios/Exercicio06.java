package cursojava.basico.aula17.exercicios;

public class Exercicio06 {

	public static void main(String[] args) {

//		6. Faça um programa que imprima na tela os números de 1 a 20, um
//		abaixo do outro. Depois modifique o programa para que ele mostre os
//		números um ao lado do outro.
		
		int i = 1;
		while (i<=20) {
			System.out.println("Contador " + i +" ");
			i++;
		}
		
		i=1;
		while (i<=20) {
			System.out.print("Contador " + i +" ");
			i++;
		}

	}

}
