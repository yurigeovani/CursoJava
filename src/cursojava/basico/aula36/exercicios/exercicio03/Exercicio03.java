package cursojava.basico.aula36.exercicios.exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

//		2. Escreva	uma	classe	para	representar	um	Curso,	que	tem	nome	e	horário.	
//		Cada	curso	tem	um	Professor,	que	possui	nome,	departamento	e	email.	
//		Cada	Curso	também	pode	ter	vários	alunos	(tipo	Aluno).	Cada	Aluno	tem	
//		nome,	matricula	e	4	notas. Escreva	um	programa	teste	que	crie	um	Curso	
//		com	5	alunos,	e	que	peça	para	o	usuário	entrar	com	as	4	notas	de	cada	
//		aluno.	Ao	final,	imprima	a	média	de	cada	aluno,	se	o	mesmo	está	aprovado
//		(media	maior	ou	igual	a	7),	e	qual	é	a	média	da	turma.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o nome do curso: ");
		String nomeCurso = scan.nextLine();
		System.out.print("Informe o horário do curso: ");
		String horaCurso = scan.nextLine();
		
		Curso curso = new Curso();
		curso.setNome(nomeCurso);
		curso.setHora(horaCurso);
		
		System.out.println("##### DADOS DO PROFESSOR #####");
		System.out.print("Nome: ");
		String nomeProf = scan.nextLine();
		System.out.print("Departamento: ");
		String depProf = scan.nextLine();
		System.out.print("Email: ");
		String emailProf = scan.nextLine();
		
		Professor professor = new Professor();
		professor.setNome(nomeProf);
		professor.setDepartamento(depProf);
		professor.setEmail(emailProf);
		curso.setProfessor(professor);
		
		Aluno[] alunos = new Aluno[5];
		for(int i=0; i<alunos.length;i++) {
			System.out.println("##### DADOS DOS ALUNOS #####");
			System.out.print("NOME: ");
			String nomeAluno = scan.next();
			System.out.print("MATRÍCULA: ");
			int matAluno = scan.nextInt();
			System.out.println("### NOTAS ###");

			double[] notas = new double[4];
			for(int j=0; j<notas.length; j++) {
				System.out.print("N" + (j+1) + ": ");
				notas[j]=scan.nextDouble();
			}
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);
			
			alunos[i]=aluno;
		}
		curso.setAlunos(alunos);
		
		System.out.println("#### MÉDIA DOS ALUNOS ####");
		for(int i=0; i<alunos.length; i++) {
			System.out.println("Média " + alunos[i].getNome() + ": " + alunos[i].calcularMedia());
		}
		System.out.println("__________________________________");
		System.out.println("Média da Turma: " + curso.calcularMediaTurma());
	}
}