package cursojava.basico.aula36.exercicios.exercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

//		2. Escreva	uma	classe	para	representar	um	Curso,	que	tem	nome	e	hor�rio.	
//		Cada	curso	tem	um	Professor,	que	possui	nome,	departamento	e	email.	
//		Cada	Curso	tamb�m	pode	ter	v�rios	alunos	(tipo	Aluno).	Cada	Aluno	tem	
//		nome,	matricula	e	4	notas. Escreva	um	programa	teste	que	crie	um	Curso	
//		com	5	alunos,	e	que	pe�a	para	o	usu�rio	entrar	com	as	4	notas	de	cada	
//		aluno.	Ao	final,	imprima	a	m�dia	de	cada	aluno,	se	o	mesmo	est�	aprovado
//		(media	maior	ou	igual	a	7),	e	qual	�	a	m�dia	da	turma.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("#### DADOS DO CURSO ####");
		System.out.print("NOME: ");
		String nomeCurso = scan.nextLine();
		System.out.print("HOR�RIO: ");
		String horaCurso = scan.nextLine();
		
		Curso curso = new Curso();
		curso.setNome(nomeCurso);
		curso.setHora(horaCurso);
		
		System.out.println("#### DADOS DO PROFESSOR ####");
		System.out.print("NOME: ");
		String nomeProf = scan.nextLine();
		System.out.print("DEPARTAMENTO: ");
		String depProf = scan.nextLine();
		System.out.print("EMAIL: ");
		String emailProf = scan.nextLine();
		
		Professor professor = new Professor();
		professor.setNome(nomeProf);
		professor.setDepartamento(depProf);
		professor.setEmail(emailProf);
		
		curso.setProfessor(professor);
		
		Aluno[] alunos = new Aluno[5];
		for(int i=0; i<alunos.length; i++) {
			System.out.println("#### DADOS ALUNO ####");
			System.out.print("NOME: ");
			String nomeAluno = scan.next();
			System.out.print("MATR�CULA: ");
			int matAluno = scan.nextInt();
			
			double[] notasAluno = new double[4];
			System.out.println("#### NOTAS ####");
			for(int j=0; j<notasAluno.length; j++) {
				System.out.print("N" + (j+1) + ": ");
				notasAluno[j] = scan.nextDouble();
			}
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notasAluno);
			alunos[i]=aluno;
		}
		curso.setAlunos(alunos);
		
		System.out.println("#### M�DIA DE ALUNOS ####");
		for(int i=0; i<alunos.length; i++) {
			System.out.println(alunos[i].getNome() + ": " +	alunos[i].calcularMedia());
		}
		System.out.println("M�dia da turma: " + curso.calcularMediaTurma());
	}
}