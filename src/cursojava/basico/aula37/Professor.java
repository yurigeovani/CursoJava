package cursojava.basico.aula37;

public class Professor extends Pessoa {
	private double salario;
	private String nomeCurso;

	public Professor() {
	}
	
	public Professor(String nome, String endereco, String telefone, String cpf, double salario, String nomeCurso) {
		this.salario = salario;
		this.nomeCurso = nomeCurso;
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
}