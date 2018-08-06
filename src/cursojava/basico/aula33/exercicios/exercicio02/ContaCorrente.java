package cursojava.basico.aula33.exercicios.exercicio02;

public class ContaCorrente {

	private int numero;
	private int agencia;
	private double saldo;
	private double chequeEspecial;
	private double limite;
	private boolean validarOperacao;
	private boolean especial;
	
	public ContaCorrente() {
		this.especial = true;
		this.chequeEspecial = 1000;
		setLimite(getChequeEspecial()+getSaldo());
	}

	public ContaCorrente(int numero, int agencia, double saldo, boolean especial, double chequeEspecial,
			double limite) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.especial = especial;
		this.chequeEspecial = chequeEspecial;
		this.limite = limite;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public boolean isValidarOperacao() {
		return validarOperacao;
	}

	public void setValidarOperacao(boolean operacao) {
		this.validarOperacao = operacao;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	//lista as operações
	void mostrarOperacao () {
		System.out.println("Operações disponíveis: ");
		System.out.println("1) Realizar saque");
		System.out.println("2) Realizar depósito");
		System.out.println("3) Verificar saldo");
		System.out.println("4) Verificar limite especial");
		System.out.println("5) Sair");
		
	}
	
	//valida a operação escolhida
	void validarOperacao(int escolhaOperacao) {
		if(escolhaOperacao<1 || escolhaOperacao>5) {
			System.out.println("Operação indisponível!");
			setValidarOperacao(false);
//			return false;
		} else {
			setValidarOperacao(true);
//			return true;
		}
	}
	
	boolean realizarSaque(double valorSaque) {
		//verifica se tem saldo na conta
		if(valorSaque<=getSaldo()) {
			setSaldo(getSaldo()-valorSaque);
			System.out.println("Saque realizado com sucesso!"); // saque realizado
			return true;
		} else {
			//verifica se tem saldo em cheque especial
			if(isEspecial()) {
				if(valorSaque<=getLimite()) {
					setSaldo(getSaldo()-valorSaque);
					setLimite(getChequeEspecial()+getSaldo());
					System.out.println("Saque realizado com sucesso!"); // saque realizado
					System.out.println("Saldo: R$ " + getSaldo());
					System.out.println("Limite Especial: R$ " + getLimite());
					return true; // saque utilizando cheque especial
				} else {
					System.out.println("Operação não realizada! Saldo insuficiente!");
					System.out.println("Saldo: R$ " + getSaldo() );
					System.out.println("Limite Especial: R$ " + getLimite());
					return false; // não possui saldo em cheque especial
				}
			} else {
				System.out.println("Operação não realizada!");
				System.out.println("Saldo insuficiente e não possui cheque especial!");
				return false; // saque não realizado
			}
		}
	}

	void realizarDeposito(double valorDeposito) {
		setSaldo(getSaldo()+valorDeposito);
	}
	
	void consultarSaldo(){
		System.out.println("Saldo atual: R$ " + getSaldo());
	}
	
	void verificarLimite() {
		if(isEspecial()) {
			setLimite(getChequeEspecial()+getSaldo());
			System.out.println("Limite Especial: R$ " + getLimite());
		} else {
			System.out.println("Não possui limite especial!");
		}
	}
}