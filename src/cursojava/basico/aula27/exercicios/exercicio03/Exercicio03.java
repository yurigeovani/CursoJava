package cursojava.basico.aula27.exercicios.exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		int qtdDisciplinas;
		
		System.out.println("Dados cadastrais do aluno:");
		System.out.print("Nome: ");
		aluno.nome = scan.next();
		System.out.print("Matrícula: ");
		aluno.matricula = scan.nextInt();
		System.out.print("Curso: ");
		aluno.curso = scan.next();
		
		System.out.print("Informe a quantidade de disciplinas: ");
		qtdDisciplinas = scan.nextInt();
		
		aluno.nomesDisciplinas = new String[qtdDisciplinas];
		aluno.notasDisciplinas = new double[qtdDisciplinas][4];
		
		for(int i=0; i<aluno.nomesDisciplinas.length; i++) {
			System.out.print("Informe o nome para a disciplina " + (i+1) + ": ");
			aluno.nomesDisciplinas[i] = scan.next();
		}
		
		System.out.println("Informe as notas para as disciplinas a seguir[0-10]: ");
		for(int i=0; i<aluno.nomesDisciplinas.length; i++) {
			System.out.println(aluno.nomesDisciplinas[i]);
			for(int j=0; j<aluno.notasDisciplinas[i].length; j++) {
				System.out.print("Nota " + (j+1) + ": ");
				aluno.notasDisciplinas[i][j]=scan.nextDouble();
				if(aluno.notasDisciplinas[i][j]<0 || aluno.notasDisciplinas[i][j]>10) {
					System.out.println("Nota inválida! Digite novamente!");
					j--;
				}
			}
		}

		aluno.infoAluno();
		
		for(int i=0; i<aluno.nomesDisciplinas.length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.nomesDisciplinas[i] + ": APROVADO!");
				System.out.println("Média: " + aluno.calcularMedia(i));
			} else {
				System.out.println("Disciplina " + aluno.nomesDisciplinas[i] + ": REPROVADO!");
				System.out.println("Média: " + aluno.calcularMedia(i));				
			}
		}		
		
	}

}