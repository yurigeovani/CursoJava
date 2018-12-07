package cursojava.basico.aula43.exercicios.exercicio02.review;

public class PessoaJuridica extends Contribuinte{

	private String cnpj;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
//		return super.getRendaBruta()*0.1;
		return super.getRendaBruta()*10/100;
	}
	@Override
	public String toString() {
		return "PessoaJuridica [CNPJ=" + cnpj + ", getNome()=" + getNome() + ", getRendaBruta()=" + getRendaBruta() + ", Imposto a ser pago = R$ " + calcularImposto() + "]";
	}
}