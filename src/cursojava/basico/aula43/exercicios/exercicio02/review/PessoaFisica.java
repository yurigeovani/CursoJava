package cursojava.basico.aula43.exercicios.exercicio02.review;

public class PessoaFisica extends Contribuinte {
	private String cpf;

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {
		double renda = super.getRendaBruta();
		if(renda<=1400) {
			return 0;
		}
		if(renda<=2100) {
			return renda*0.1-100;
		}
		if(renda<=2800) {
			return renda*0.15-270;
		}
		if(renda<=3600) {
			return renda*0.25-500;
		}
		return renda*0.3-700;
	}
	
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", getNome()=" + getNome() + ", getRendaBruta()=" + getRendaBruta() + ", Imposto a ser pago = R$ " + calcularImposto() + "]";
	}
}