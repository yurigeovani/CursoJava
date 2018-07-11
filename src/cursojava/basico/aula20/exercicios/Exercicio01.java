package cursojava.basico.aula20.exercicios;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {

//		1. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
//		Após isso determine o maior número da matriz e a sua posição (linha, coluna).
		
		int[][] numerosAleatorios = new int[4][4];
		
		Random numeroRandom = new Random();
		
		int maior =0;
		int linha = 0;
		int col = 0;
		
		for(int i=0;i<numerosAleatorios.length; i++) {
			System.out.println("Linha: " + i);
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j]= numeroRandom.nextInt(100);
				System.out.println("Coluna " + j + ": " + numerosAleatorios[i][j]);
				if(numerosAleatorios[i][j]>maior) {
					maior=numerosAleatorios[i][j];
					linha = i;
					col = j;
				}
			}
		}
		
		System.out.println("Maior número da matriz: " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + col);
	}

}