package cursojava.basico.aula43.exercicios.exercicio01;

public class ContaBancaria {

	private String nomeCliente;
	private int numConta;
	private double saldo;
	private ContaEspecial especial;
	private ContaPoupanca poupanca;
	
	public ContaBancaria() {
		super();
	}
	public ContaBancaria(String nomeCliente, int numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
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
	public ContaEspecial getEspecial() {
		return especial;
	}
	public void setEspecial(ContaEspecial especial) {
		this.especial = especial;
	}
	public ContaPoupanca getPoupanca() {
		return poupanca;
	}
	public void setPoupanca(ContaPoupanca poupanca) {
		this.poupanca = poupanca;
	}

	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	public void sacar(double valor) {
		if(getSaldo()<=0 || valor>getSaldo()) {
			System.out.println("Sem saldo disponível!");
		} else {
			setSaldo(getSaldo()-valor);
			System.out.println("Saque de " + valor + " realizado!");
		}
	}
	
	public void depositar (double valor) {
		setSaldo(getSaldo()+valor);
		System.out.println("Depósito de " + valor + " realizado!");
	}
	
	public void menu() {
		System.out.println("################## BANCO MIND ##################");
		System.out.println("OPÇÕES:");
		if(poupanca.isExiste()) {
			
		} else {
			System.out.print("Deseja criar agora? [S/N]");
		}
		System.out.println("1) Criar conta poupança:");
		System.out.println("2) Criar conta especial:");
		System.out.println("0) Sair:");
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo: R$ " + getSaldo());
	}
	
	public void opcaoEscolhida (int escolha) {
		switch (escolha) {
		case 1:
			
			break;
		default:
			break;
		}
	}
}