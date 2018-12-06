package cursojava.basico.aula43.exercicios.exercicio01.review;

public class ContaEspecial extends ContaBancaria{

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", getNomeCliente()=" + getNomeCliente() + ", getNumConta()="
				+ getNumConta() + ", getSaldo()=" + getSaldo() + "]";
	}
	
	public boolean sacar (double valor) {

		double saldoComLimite = super.getSaldo() + limite;
		
		if((saldoComLimite-valor)>=0) {
			super.setSaldo(super.getSaldo()-valor);
			return true;
		} 
		return false;
	}

}