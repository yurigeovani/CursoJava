package cursojava.basico.aula43.exercicios.exercicio01;

public class ContaEspecial extends ContaBancaria {

	private double limite = 500;
	private boolean existe = false;
	
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
	public boolean isExiste() {
		return existe;
	}
	public void setExiste(boolean existe) {
		this.existe = existe;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo: R$ " + getSaldo());
		System.out.println("Saldo especial R$: " + (getSaldo()+getLimite()));
	}

	public void sacar(double valor) {
		if(valor>(getSaldo()+getLimite())) {
			System.out.println("Sem saldo dispon√≠vel!");
			if(getSaldo()<0) {
				System.out.println("Saldo disponÌvel: R$ " + Math.abs((getLimite()+getSaldo())));
			} else {
				System.out.println("Saldo disponÌvel: R$ " + (getLimite()+getSaldo()));
			}
		} else {
			setSaldo(getSaldo()-valor);
			System.out.println("Saque de " + valor + " realizado!");
		}
	}
}