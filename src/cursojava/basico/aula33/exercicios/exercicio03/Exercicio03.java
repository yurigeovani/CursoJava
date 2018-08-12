package cursojava.basico.aula33.exercicios.exercicio03;

import java.util.Scanner;

class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		3. Escreva	uma	classe para	representar	um	Aluno.	Adicione	atributos	
//		relacionados	às	caracteristicas	de	um	Aluno,	como	nome,	matricula,	curso	
//		que	está	matriculado,	nome	de	3	disciplinas	que	está	cursando e	as	notas	
//		dessas 3 disciplinas. Desenvolva	um	método	para	verificar	se	o	aluno	está	
//		aprovado	(nota	maior	ou	igual	a	7)	em	uma determinada	disciplina.
//		Escreva	um	programa	para	testar	essa	classe,	que	pede	as	informações	do	
//		aluno	ao	usuário	e	ao	final	informa	o	nome	das	disciplinas,	mostra	as	
//		notas e	mostra	se	o	aluno	foi	aprovado	ou	não.
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Dados cadastrais do aluno:");
		System.out.print("Nome: ");
		aluno.setNome(scan.next());
		System.out.print("Matrícula: ");
		aluno.setMatricula(scan.nextInt());
		System.out.print("Curso: ");
		aluno.setCurso(scan.next());

		System.out.print("Informe a quantidade de disciplinas: ");
		aluno.setQtdDisciplinas(scan.nextInt());;

		aluno.setNomesDisciplinas(new String[aluno.getQtdDisciplinas()]);
		aluno.setNotasDisciplinas(new double[aluno.getQtdDisciplinas()][4]);

		for(int i=0; i<aluno.getNomesDisciplinas().length; i++) {
			System.out.print("Informe o nome para a disciplina " + (i+1) + ": ");
			aluno.setNomesDisciplinasVetor(i, scan.next());
		}
		
		System.out.println("Informe as notas para as disciplinas a seguir[0-10]: ");
		for(int i=0; i<aluno.getNomesDisciplinas().length; i++) {
			System.out.println(aluno.getNomesDisciplinas()[i]);
			for(int j=0; j<aluno.getNotasDisciplinas()[i].length; j++) {
				System.out.print("Nota " + (j+1) + ": ");
				aluno.setNotasDisciplinasVetor(i, j, scan.nextDouble());
				if(aluno.getNotasDisciplinas()[i][j]<0 || aluno.getNotasDisciplinas()[i][j]>10) {
					System.out.println("Nota inválida! Digite novamente!");
					j--;
				}
			}
		}

		aluno.infoAluno();
		
		for(int i=0; i<aluno.getNomesDisciplinas().length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.getNomesDisciplinas()[i] + ": APROVADO!");
				System.out.println("Média: " + aluno.calcularMedia(i));
			} else {
				System.out.println("Disciplina " + aluno.getNomesDisciplinas()[i] + ": REPROVADO!");
				System.out.println("Média: " + aluno.calcularMedia(i));				
			}
		}		


	}

}
