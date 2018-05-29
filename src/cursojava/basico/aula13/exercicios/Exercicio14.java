package cursojava.basico.aula13.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

//		14. Faça um programa que peça o tamanho de um arquivo para download
//		(em Mb) e a velocidade de um link de Internet (em Mbps), calcule e
//		informe o tempo aproximado de download do arquivo usando este link
//		(em minutos).

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do arquivo em Mb: ");
		double tamanho = scan.nextDouble();
		
		System.out.print("Informe a velocidade do link de internet em Mbps: ");
		double internet = scan.nextDouble();
		
		System.out.println("Tempo aproximado para conclusão do download: " + (tamanho/internet)/60 + "min");
	}

}
