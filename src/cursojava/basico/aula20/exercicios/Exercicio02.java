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
//		int linha5 = 5;
//		int col7 = 7;
		
		for(int i=0; i<numerosAleatorios.length; i++) {
			System.out.println("Linha: " + i);
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
				System.out.println("Coluna " + j + ": " + numerosAleatorios[i][j]);
			}
		}
		
		for(int i=0; i<numerosAleatorios.length; i++) {
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				if(numerosAleatorios[4][j]>maior) {
					maior = numerosAleatorios[4][j];
					System.out.println("Maior valor da linha " + i + ", coluna " + j + ": " + maior);
				}
				if(numerosAleatorios[4][j]<menor) {
					menor = numerosAleatorios[4][j];
					System.out.println("Menor valor da linha " + i + ", coluna " + j + ": " + menor);
				}
			}
		}
		
		maior = Integer.MIN_VALUE;
		menor = Integer.MAX_VALUE;
		
		for(int i=0; i<numerosAleatorios.length; i++) {
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				if(numerosAleatorios[i][7]>maior) {
					maior = numerosAleatorios[i][7];
					System.out.println("Maior valor da linha " + i + ", coluna " + j + ": " + maior);
				}
				if(numerosAleatorios[i][7]<menor) {
					menor = numerosAleatorios[i][7];
					System.out.println("Menor valor da linha " + i + ", coluna " + j + ": " + menor);
				}
			}
		}		
		
	}

}
