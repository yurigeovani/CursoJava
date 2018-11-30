package cursojava.basico.aula43.exercicios.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();
//		ContaPoupanca poupanca = new ContaPoupanca();
//		ContaEspecial especial = new ContaEspecial();
		

		System.out.println("######################## BANCO MIND ########################");
		conta.menu();
		System.out.print("Selecione a opção desejada: ");
		conta.opcaoEscolhida(scan.nextInt());
		

	}

}