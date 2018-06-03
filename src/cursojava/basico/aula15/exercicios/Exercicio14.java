package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

//		14. Faça um programa que lê as duas notas parciais obtidas por um aluno
//		numa disciplina ao longo de um semestre, e calcule a sua média. A
//		atribuição de conceitos obedece à tabela abaixo:
//		Média de Aproveitamento	| Conceito
//		Entre 9.0 e 10.0 		| A
//		Entre 7.5 e 9.0 		| B
//		Entre 6.0 e 7.5 		| C
//		Entre 4.0 e 6.0 		| D
//		Entre 0.0 e 4.0 		| E
//		O algoritmo deve mostrar na tela as notas, a média, o conceito
//		correspondente e a mensagem “APROVADO” se o conceito for
//		A, B ou C ou “REPROVADO” se o conceito for D ou E.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a nota 1: ");
		double nota1 = scan.nextDouble();
		System.out.print("Informe a nota 2: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1+nota2)/2;
		String conceito;
		String situacao;
		
		if (media<4) {
			conceito = "E";
			situacao = "REPROVADO!";
		} else if (media<6) {
			conceito = "D";
			situacao = "REPROVADO!";
		} else if (media<7.5) {
			conceito = "C";
			situacao = "APROVADO!";
		} else if (media<9) {
			conceito = "B";
			situacao = "APROVADO!";
		} else {
			conceito = "A";
			situacao = "APROVADO!";
		}

		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Media: " + media);
		
		switch (conceito) {
		case "E":
			System.out.println("Conceito: " + conceito);
			System.out.println("O aluno está " + situacao);
			break;
		case "D":
			System.out.println("Conceito: " + conceito);
			System.out.println("O aluno está " + situacao);
			break;
		case "C":
			System.out.println("Conceito: " + conceito);
			System.out.println("O aluno está " + situacao);
			break;
		case "B":
			System.out.println("Conceito: " + conceito);
			System.out.println("O aluno está " + situacao);
			break;
		case "A":
			System.out.println("Conceito: " + conceito);
			System.out.println("O aluno está " + situacao);
			break;
		}
		
	}

}