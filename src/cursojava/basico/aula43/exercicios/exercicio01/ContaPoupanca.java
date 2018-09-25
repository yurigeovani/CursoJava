package cursojava.basico.aula43.exercicios.exercicio01;

public class ContaPoupanca extends ContaBancaria {

	double diaRendimento;
	
	public double getDiaRendimento() {
		return diaRendimento;
	}
	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public ContaPoupanca() {
		super();
	}
	public ContaPoupanca(String nomeCliente, int numConta, double saldo) {
		super(nomeCliente, numConta, saldo);
	}
	
	public void consultarSaldo2() {
		System.out.println("super.getSaldo = " + super.getSaldo());
		super.setSaldo(super.getSaldo()+(getDiaRendimento()*super.getSaldo()));
		System.out.println("calc " + super.getSaldo());
//		return super.getSaldo();
	}
}