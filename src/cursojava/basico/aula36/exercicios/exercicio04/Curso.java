package cursojava.basico.aula36.exercicios.exercicio04;

public class Curso {

	private String nome;
	private String hora;
	private Professor professor;
	private Aluno[] alunos;
	private double mediaTurma;

	public Curso() {
	}
	public Curso(String nome, String hora, Professor professor, Aluno[] alunos, double mediaTurma) {
		this.nome = nome;
		this.hora = hora;
		this.professor = professor;
		this.alunos = alunos;
		this.mediaTurma = mediaTurma;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
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
	public double getMediaTurma() {
		return mediaTurma;
	}
	public void setMediaTurma(double mediaTurma) {
		this.mediaTurma = mediaTurma;
	}
	
	public double calcularMediaTurma() {
		double soma = 0;
		for(Aluno a : alunos) {
			soma+=a.getMedia();
		}
		setMediaTurma(soma/alunos.length);
		return getMediaTurma(); 
	}
}