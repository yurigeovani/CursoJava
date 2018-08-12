package cursojava.basico.aula33.exercicios.exercicio03;

class Aluno {

	private int matricula;
	private int qtdDisciplinas;
	private String nome;
	private String curso;
	private String[] nomesDisciplinas;
	private double[][] notasDisciplinas;
	
	public Aluno() {
	}

	public Aluno(String nome, int matricula, String curso, String[] nomesDisciplinas, double[][] notasDisciplinas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.nomesDisciplinas = nomesDisciplinas;
		this.notasDisciplinas = notasDisciplinas;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getQtdDisciplinas() {
		return qtdDisciplinas;
	}

	public void setQtdDisciplinas(int qtdDisciplinas) {
		this.qtdDisciplinas = qtdDisciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getNomesDisciplinas() {
		return nomesDisciplinas;
	}

	public void setNomesDisciplinas(String[] nomesDisciplinas) {
		this.nomesDisciplinas = nomesDisciplinas;
	}

	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}
	
	public void setNomesDisciplinasVetor(int posI, String nomeDisciplina) {
		this.nomesDisciplinas[posI]=nomeDisciplina;
	}
	
	public void setNotasDisciplinasVetor(int posI, int posJ, double nota) {
		this.notasDisciplinas[posI][posJ]=nota;
	}

	//lista as informações do aluno
	public void infoAluno() {
		System.out.println("Aluno: " + getNome());
		System.out.println("Matrícula: " + getMatricula());
		System.out.println("Curso: " + getCurso());
		
		for(int i=0; i<getNomesDisciplinas().length; i++) {
			System.out.println("Notas da disciplina " + (i+1) + ") " + getNomesDisciplinas()[i] + ":");
			for(int j=0; j<getNotasDisciplinas()[i].length; j++) {
				System.out.println("Nota " + (j+1) + ": " + getNotasDisciplinas()[i][j]);
			}
		}
	}
	
	public double calcularMedia(int indice) {
		double soma = 0, media = 0;
		for(int i=0; i<getNotasDisciplinas()[indice].length; i++) {
			soma += getNotasDisciplinas()[indice][i];
		}
		media = soma/4;
		return media;
	}

	public boolean verificarAprovado (int indice) {
		if(calcularMedia(indice)>=7) {
			return true;
		} else {
			return false;
		}
	}
}

