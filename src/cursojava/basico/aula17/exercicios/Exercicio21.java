package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

//		21. Faça um programa que calcule o número médio de alunos por turma.
//		Para isto, peça a quantidade de turmas e a quantidade de alunos para
//		cada turma. As turmas não podem ter mais de 40 alunos.

		Scanner scan = new Scanner(System.in);
		
		int medAlunos = 0;
		int qtdAlunos = 0;
		int totalAlunos = 0;

		System.out.print("Informe a quantidade de turmas: ");
		int qtdTurmas = scan.nextInt();
		
		for (int i = 1; i<=qtdTurmas; i++) {
			System.out.print("Informe a quantidade de alunos da turma " + i + ": ");
			qtdAlunos = scan.nextInt();
			if (qtdAlunos<=0 || qtdAlunos>40) {
				System.out.println("Quantidade inválida!");
				i--;
			} else {
				totalAlunos += qtdAlunos;
			}
		}

		medAlunos = totalAlunos/qtdTurmas;
		System.out.println("A média de alunos por turma é: " + medAlunos);
		
	}

}