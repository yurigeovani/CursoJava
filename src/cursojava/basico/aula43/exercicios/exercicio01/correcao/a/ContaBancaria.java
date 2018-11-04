package cursojava.basico.aula43.exercicios.exercicio01.correcao.a;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	public void depositar(double valor) {
		this.saldo+= valor;
	}
	
	public boolean sacar (double valor) {
		if((this.saldo-valor)>=0) {
			saldo-=valor;
			return true;
		}
		return false;
	}
}