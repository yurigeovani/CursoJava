package cursojava.basico.aula27.exercicios.exercicio02;

public class ContaCorrente {

	
	int numero;
	int agencia;
	double saldo;
	boolean especial;
	double chequeEspecial;
	double limite;

	boolean realizarSaque(double valorSaque) {
		//verifica se tem saldo na conta
		if(valorSaque<=saldo) {
			saldo-=valorSaque;
			System.out.println("Saque realizado com sucesso!"); // saque realizado
			return true;
		} else {
			//verifica se tem saldo em cheque especial
			if(especial) {
				if(valorSaque<=limite) {
					saldo-=valorSaque;
					limite = chequeEspecial + saldo;
					System.out.println("Saque realizado com sucesso!"); // saque realizado
					System.out.println("Cheque Especial: R$ " + chequeEspecial);
					System.out.println("Saldo: R$ " + saldo);
					System.out.println("Limite Especial: R$ " + limite);
					return true; // saque utilizando cheque especial
				} else {
					System.out.println("Operação não realizada! Saldo insuficiente!");
					System.out.println("Saldo: R$ " + saldo );
					System.out.println("Limite Especial: R$ " + limite);
					return false; // não possui saldo em cheque especial
				}
			} else {
				System.out.println("Operação não realizada!");
				System.out.println("Saldo insuficiente e não possui cheque especial!");
				return false; // saque não realizado
			}
		}
	}
	
	double realizarDeposito(double valorDeposito) {
		saldo+=valorDeposito;
		return saldo;
	}
	
	void consultarSaldo(){
		System.out.println("Saldo atual: R$ " + saldo);
	}
	
	void verificarLimite() {
		if(especial) {
			limite=chequeEspecial + saldo;
			System.out.println("Cheque Especial: R$ " + chequeEspecial);
			System.out.println("Limite Especial: R$ " + limite);
		} else {
			System.out.println("Não possui limite especial!");
		}
	}
}