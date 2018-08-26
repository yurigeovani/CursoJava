package cursojava.basico.aula36.exercicios.exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

//		2. Escreva	uma	classe	para	representar	um	Curso,	que	tem	nome	e	horário.	
//		Cada	curso	tem	um	Professor,	que	possui	nome,	departamento	e	email.	
//		Cada	Curso	também	pode	ter	vários	alunos	(tipo	Aluno).	Cada	Aluno	tem	
//		nome,	matricula	e	4	notas. Escreva	um	programa	teste	que	crie	um	Curso	
//		com	5	alunos,	e	que	peça	para	o	usuário	entrar	com	as	4	notas	de	cada	
//		aluno.	Ao	final,	imprima	a	média	de	cada	aluno,	se	o	mesmo	está	aprovado
//		(media	maior	ou	igual	a	7),	e	qual	é	a	média	da	turma.
		
		Scanner scan = new Scanner(System.in);
		
		Curso curso = new Curso();
		Professor professor = new Professor();

//		OS DADOS REFERENTE A CURSO E PROFESSOR SERÃO COMENTADOS PARA FACILITAR O TESTE				
//		System.out.println("############### Dados do Curso ###############");
//		System.out.print("Nome: ");
//		curso.setNome(scan.next());
//		System.out.print("Horário: ");
//		curso.setHorario(scan.next());
//		
//		System.out.println("############### Dados do Professor ###############");
//		System.out.print("Professor: ");
//		professor.setNome(scan.next());
//		System.out.print("Departamento: ");
//		professor.setDepartamento(scan.next());
//		System.out.print("Email: ");
//		professor.setEmail(scan.next());
		

		//PARA TESTE, O ARRAY SERÁ SOMENTE DE DOIS ALUNOS
		Aluno[] alunos = new Aluno[2];
		
		for(int i=0; i<alunos.length; i++) {
			System.out.println("############### Dados dos Alunos ###############");
			Aluno aluno = new Aluno();
			System.out.print("Nome: ");
			aluno.setNome(scan.next());
			System.out.print("Matrícula: ");
			aluno.setMatricula(scan.nextInt());
			alunos[i]=aluno;

			System.out.println("### NOTAS PARA O ALUNO " + alunos[i].getNome()+ " ###");
			double notas[] = new double[4];
			for(int j=0; j<notas.length; j++) {
				System.out.print("N" + (j+1)+": ");
				notas[j]=scan.nextDouble();
				aluno.setNotas(notas);
			}
		}

		//TESTE PARA SABER SE AS NOTAS ESTÃO SENDO SETADAS
		for(int i=0; i<alunos.length;i++) {
			System.out.println("Aluno " + alunos[i].getNome());
			for(int j=0; j<alunos[i].getNotas().length; j++) {
				System.out.println("N" + (j+1) + ": " + alunos[i].getNotas()[j]);
			}
			alunos[i].calcularMedia();
		}
	}
}