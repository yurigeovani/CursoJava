package cursojava.basico.aula43.exercicios.exercicio01.review;

public class Exercicio01 {

	public static void main(String[] args) {

		System.out.println("### Teste Conta Especial ###");
		ContaEspecial ContaEspecial = new ContaEspecial();
		ContaEspecial.setNomeCliente("Cliente conta especial");
		ContaEspecial.setNumConta("2121");
		ContaEspecial.setLimite(50);
		
		ContaEspecial.depositar(100);
		
		realizarSaque(ContaEspecial, 50);
		
		realizarSaque(ContaEspecial, 70);
		realizarSaque(ContaEspecial, 80);
				
		System.out.println(ContaEspecial);
	}
	
	private static void realizarSaque (ContaBancaria conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
		}

	}

}