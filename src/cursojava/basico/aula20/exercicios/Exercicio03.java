package cursojava.basico.aula20.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

//		3. Capture do teclado valores para preenchimento de uma matriz M
//		3x3. Após a captura imprima a matriz criada e encontre a
//		quantidade de números pares, a quantidade de números ímpares.
		
		Scanner scan = new Scanner(System.in);
		
		int[][][] matriz = new int[3][3][3];
		int qtdPar = 0;
		int qtdImpar = 0;
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				for(int k=0; k<matriz[i][j].length; k++) {
					System.out.print("Informe o valor da linha " + i + ", coluna " + j + " e profundidade " + k + ": ");
					matriz[i][j][k] = scan.nextInt();
				}
			}
		}
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				for(int k=0; k<matriz[i][j].length; k++) {
					System.out.println("Valor da linha " + i + ", coluna " + j + " e profundidade " + k + ": " + matriz[i][j][k]);
					if(matriz[i][j][k]%2==0) {
						qtdPar++;
					} else {
						qtdImpar++;
					}
				}
			}
		}
		System.out.println("Quantidade de números PAR: " + qtdPar);
		System.out.println("Quantidade de números ÍMPAR: " + qtdImpar);
	}

}
