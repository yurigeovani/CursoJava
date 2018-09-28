package cursojava.basico.aula43.exercicios.exercicio01.correcao.b;

public class Teste {

	public static void main(String[] args) {

		System.out.println("#### Teste ContaBancária ####");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente conta simples");
		contaSimples.setNumConta("111111");
		
		contaSimples.depositar(100);
		
		if(contaSimples.sacar(50)) {
			System.out.println("Saque efetuado com sucesso! Novo saldo = R$ " + contaSimples.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de " + 50 + "; saldo de " + contaSimples.getSaldo());
		}
		
		
		
		contaSimples.sacar(70);
		
		System.out.println(contaSimples);
		
	}
}