package cursojava.basico.aula36.exercicios.exercicio03;

public class Curso {

	private String nome;
	private String hora;
	private Professor professor;
	private Aluno[] alunos;
	private double media;

	public Curso() {
	}
	public Curso(String nome, String hora, Professor professor, Aluno[] alunos, double media) {
		this.nome = nome;
		this.hora = hora;
		this.professor = professor;
		this.alunos = alunos;
		this.media = media;
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
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	public double calcularMediaTurma() {
		double soma = 0;
		for(Aluno aluno : alunos) {
			soma+=aluno.getMedia();
		}
		setMedia(soma/alunos.length);
		return getMedia(); 
	}
}