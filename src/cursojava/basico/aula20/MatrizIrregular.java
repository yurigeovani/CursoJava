package cursojava.basico.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o número de pessoas entrevistadas: ");
		int numEntrevistados=scan.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.print("Entre com a quantidade de filhos: ");
			int qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.print("Digite o nome do filho " + j + ": ");
				nomesFilhos[i][j] = scan.next();
			}
		}
		
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Pessoa: " + i + " tem " + nomesFilhos[i].length + " filho(s):");
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}

	}

}