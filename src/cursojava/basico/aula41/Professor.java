package cursojava.basico.aula41;

public class Professor extends Pessoa {

	private double salario;
	private String nomeCurso;
	
	public Professor() {
	}
	public Professor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
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
	
	public String obterEtiquetaEndereco() {
		String s = "Endereço do professor: ";
		s += this.getEndereco();
		return s;
	}

	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endereço do professor: ");
		System.out.println(this.obterEtiquetaEndereco());
	}
}