package cursojava.basico.aula43;

import java.util.Arrays;

public class Aluno {

	private String curso;
	private double[] notas;
	
	public Aluno() {
		super();
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
	
	public double calcularMedia(){
		return 0;
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
	
//	public String toString() {
//		String s = curso + "\n";
//		for(double nota : notas) {
//			s+=nota + " ";
//		}
//		return s;
//	}
}