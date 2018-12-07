package cursojava.basico.aula43.exercicios.exercicio02;

public class Contribuinte {

	private String nome;
	private double valorImposto;
	private boolean pessoaFisica;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorImposto() {
		return valorImposto;
	}
	public void setValorImposto(double valorImposto) {
		this.valorImposto = valorImposto;
	}	
	public boolean isPessoaFisica() {
		return pessoaFisica;
	}
	public void setPessoaFisica(boolean pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	
	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", valorImposto=" + valorImposto + "]";
	}
	
	public Contribuinte(String nome, double valorImposto) {
		super();
		this.nome = nome;
		this.valorImposto = valorImposto;
	}
	
	public Contribuinte() {
		super();
	}
	
	public double calcularImposto (double salario) {
		if(isPessoaFisica() == false) {
			setValorImposto(salario*10/100);
		} else {
			if(salario<=1400) {
				setValorImposto(salario*0/100);
			} else if(salario<=2100){
				setValorImposto(salario*10/100);
			} else if(salario<=2800) {
				setValorImposto(salario*15/100);
			} else if(salario<=3600) {
				setValorImposto(salario*25/100);
			} else {
				setValorImposto(salario*30/100);
			}
		}
		return getValorImposto();
	}
}