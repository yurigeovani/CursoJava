package cursojava.basico.aula24.exercicios;

public class Exercicio05 {

	public static void main(String[] args) {

//		5. Cria uma classe para representar uma conta corrente que possui um número,	
//		  um saldo, um status que informa se ela é especial ou não, um limite.

		ContaCorrente conta = new ContaCorrente();
		conta.numero = 1234;
		conta.agencia = 656565;
		conta.especial = true;
		conta.limite = 500;
		conta.saldo = -10;
		
		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
	}

}
