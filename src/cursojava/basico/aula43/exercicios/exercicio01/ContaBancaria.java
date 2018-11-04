
package cursojava.basico.aula43.exercicios.exercicio01;

public class ContaBancaria {

	String nomeCliente;
	int numConta;
	double saldo;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public ContaBancaria() {
		super();
	}
	
	public ContaBancaria(String nomeCliente, int numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public void sacar(double vlrSaque) {
		if(vlrSaque <= getSaldo()) {
			setSaldo(getSaldo()-vlrSaque);
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

	public void depositar(double vlrDeposito) {
		setSaldo(getSaldo()+vlrDeposito);
	}
	
	public void opcoes() {
		System.out.println("################## OPÇÕES ##################");
		System.out.println("1) Sacar;");
		System.out.println("2) Depositar;");
		System.out.println("3) Consultar saldo;");
		System.out.println("4) Aplicar rendimento;");
		System.out.println("0) SAIR;");
		System.out.print("Escolha a opção desejada: ");
	}
	
	public double consultarSaldo() {
		return getSaldo();
	}
	
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
}