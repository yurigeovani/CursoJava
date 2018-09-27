package cursojava.basico.aula43.exercicios.exercicio01.correcao;

public class ContaEspecial extends ContaBancaria{

	double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", toString()=" + super.toString() + "]";
	}

	public boolean sacar (double valor) {
		double saldoComLimite = super.getSaldo() + this.limite; 
		if((saldoComLimite-valor)>=0) {
			this.setSaldo(this.getSaldo()-valor);
			return true;
		}
		return false;
	}
}