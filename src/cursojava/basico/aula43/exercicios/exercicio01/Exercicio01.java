package cursojava.basico.aula43.exercicios.exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {

		ContaBancaria conta = new ContaBancaria();
		ContaPoupanca poupanca = new ContaPoupanca();
		ContaEspecial especial = new ContaEspecial();
		
		conta.menu();
		System.out.print("Selecione a opção desejada: ");
	}

}