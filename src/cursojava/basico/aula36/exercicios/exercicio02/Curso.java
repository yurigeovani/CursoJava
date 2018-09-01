package cursojava.basico.aula36.exercicios.exercicio02;

public class Curso {

	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	
	public Curso() {
	}
	public Curso(String nome, String horario, Professor professor, Aluno[] alunos) {
		this.nome = nome;
		this.horario = horario;
		this.professor = professor;
		this.alunos = alunos;
	}
	
	public double mediaTurma() {
		double medTurma=0;
		for(Aluno med : alunos) {
			medTurma=med.getMedia();
		}
		return medTurma/alunos.length;
	}
}