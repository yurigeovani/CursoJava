package cursojava.basico.aula42;

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
}