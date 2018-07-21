package cursojava.basico.aula27.exercicios.exercicio03;

public class Aluno {

	String nome;
	int matricula;
	String curso;
	String[] nomesDisciplinas;
	double[][] notasDisciplinas;
	
	void infoAluno() {
		System.out.println("Aluno: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Curso: " + curso);
		
		for(int i=0; i<nomesDisciplinas.length; i++) {
			System.out.println("Notas da disciplina " + (i+1) + ") " + nomesDisciplinas[i] + ":");
			for(int j=0; j<notasDisciplinas[i].length; j++) {
				System.out.println("Nota " + (j+1) + ": " + notasDisciplinas[i][j]);
			}
		}
	}
	
	double calcularMedia(int indice) {
		double soma = 0, media = 0;
		for(int i=0; i<notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice][i];
		}
		media = soma/4;
		return media;
	}
	
	boolean verificarAprovado (int indice) {
		if(calcularMedia(indice)>=7) {
			return true;
		} else {
			return false;
		}
	}
}