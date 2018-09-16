package cursojava.basico.aula43;

import java.util.Arrays;

public class Aluno{

	private String curso;
	private double[] notas;

	public Aluno() {
	}
	public Aluno(String nome, String endereco, String telefone) {
		//super(nome, endereco, telefone);
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		
	}
	
	public String obterEtiquetaEndereco() {
		String s = "Endereço do aluno: ";
		//s += this.getEndereco();
		return s;
	}

	public void imprimirEtiquetaEndereco() {

		System.out.println(this.obterEtiquetaEndereco());
	}
	
//	public String toString() {
//		String s = curso + "\n";
//		for (double nota : notas) {
//			s+=nota + " ";
//		}
//		return s;
//	}

	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		Aluno other = (Aluno) obj;
		
		if(curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}
		
		return true;
	}	
}