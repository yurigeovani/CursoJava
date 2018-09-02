package cursojava.basico.aula36.exercicios.exercicio04;

public class Aluno {

	private String nome;
	private int matricula;
	private double[] notas;
	private double media;

	public Aluno() {
	}
	public Aluno(String nome, int matricula, double[] notas, double media) {
		this.nome = nome;
		this.matricula = matricula;
		this.notas = notas;
		this.media = media;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}

	public double calcularMedia() {
		double soma=0;
		for(double somaNotas : notas) {
			soma+=somaNotas;
		}
		setMedia(soma/notas.length);
		return getMedia();
	}	
}