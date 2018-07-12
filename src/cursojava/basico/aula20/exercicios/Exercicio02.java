package cursojava.basico.aula20.exercicios;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {

//		2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre
//		0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
//		qual é o maior e o menor valor da coluna 7.
		
		int[][] numerosAleatorios = new int[10][10];
		
		Random numeroRandom = new Random();
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for(int i=0; i<numerosAleatorios.length; i++) {
			System.out.println("Linha: " + (i+1));
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
				System.out.println("Coluna " + (j+1) + ": " + numerosAleatorios[i][j]);
			}
		}
		
		for(int i=0; i<numerosAleatorios.length; i++) {
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				if(i == 4 && numerosAleatorios[i][j]>maior) {
					maior = numerosAleatorios[i][j];
				}
				if(i == 4 && numerosAleatorios[i][j]<menor) {
					menor = numerosAleatorios[i][j];
				}
			}
		}

		System.out.println("Maior valor da linha 5: " + maior);
		System.out.println("Menor valor da linha 5: " + menor);

		maior = Integer.MIN_VALUE;
		menor = Integer.MAX_VALUE;
		
		for(int i=0; i<numerosAleatorios.length; i++) {
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				if(j == 6 && numerosAleatorios[i][j]>maior) {
					maior = numerosAleatorios[i][j];
				}
				if(j == 6 && numerosAleatorios[i][j]<menor) {
					menor = numerosAleatorios[i][j];
				}
			}
		}	
		
		System.out.println("Maior valor da coluna 7: " + maior);
		System.out.println("Menor valor da coluna 7: " + menor);

		
	}

}
