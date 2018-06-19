package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

//		20. Faça um programa que peça para n pessoas a sua idade, ao final o
//		programa devera verificar se a média de idade da turma varia entre 0 e
//		25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
//		ou idosa, conforme a média calculada.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Informe quantidade de idades: ");
		int qtdidades = scan.nextInt();
		int contador = 0;
		int idade = 0;
		double media = 0;
		
		for (int i = 1; i<=qtdidades; i++) {
			System.out.print("Informe a idade da pessoa " + i + ": ");
			idade = scan.nextInt();
			contador +=idade;
		}
		
		media = contador/qtdidades;
		
		if (media<=25) {
			System.out.println("Turma jovem!");
		} else if (media<=60) {
			System.out.println("Turma adulta!");
		} else if (media>60){
			System.out.println("Turma idosa!");
		}
		
	}

}
