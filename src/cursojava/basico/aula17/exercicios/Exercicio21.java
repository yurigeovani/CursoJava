package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

//		21. Faça um programa que calcule o número médio de alunos por turma.
//		Para isto, peça a quantidade de turmas e a quantidade de alunos para
//		cada turma. As turmas não podem ter mais de 40 alunos.

		Scanner scan = new Scanner(System.in);
		
		boolean validador = false;
		int medAlunos = 0;
		int qtdAlunos = 0;

		System.out.print("Informe a quantidade de turmas: ");
		int turmas = scan.nextInt();
		
		for (int i = 1; i<=turmas; i++) {
			while(!validador) {
				System.out.print("Informe a quantidade de alunos da turma " + i + ": ");
				qtdAlunos = scan.nextInt();
				if (qtdAlunos>0 && qtdAlunos<=40) {
					validador = true;
				} else {
					System.out.println("Quantidade inválida!");
				}
			}
		}

		medAlunos = qtdAlunos/turmas;
		System.out.println("A média de alunos por turma é: " + medAlunos);
		
	}

}
