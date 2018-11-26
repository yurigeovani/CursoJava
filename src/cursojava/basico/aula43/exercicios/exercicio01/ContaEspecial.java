package cursojava.basico.aula43.exercicios.exercicio01;

public class ContaEspecial extends ContaBancaria {

	private double limite;
	
	public ContaEspecial(double limite) {
		super();
		this.limite = limite;
	}
	public ContaEspecial() {
		super();
	}
	public ContaEspecial(String nomeCliente, int numConta, double saldo) {
		super(nomeCliente, numConta, saldo);
	}

	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void sacar(double valor) {
		setLimite(0-valor);
		if(getSaldo()<=0 || valor<getSaldo()) {
			System.out.println("Sem saldo disponível!");
		} else {
			setSaldo(getSaldo()-valor);
			System.out.println("Saque de " + valor + " realizado!");
		}
	}
}