package cursojava.basico.aula33.exercicios.exercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		JogoDaVelha tabuleiro = new JogoDaVelha();
		
		int linha = 0, coluna = 0;
		boolean linhaCorreta = false, colunaCorreta = false, validador = false;
		
		System.out.println("Informe o nome dos jogadores: ");
		System.out.print("Jogador 1: ");
		tabuleiro.setJogador1(scan.next());
		System.out.print("Jogador 2: ");
		tabuleiro.setJogador2(scan.next());

		tabuleiro.comecarPartida();
		
		while(!tabuleiro.verificarGanhador()) {

			tabuleiro.mostrarTabuleiro();
			
			System.out.println("Jogador " + tabuleiro.getJogador() + ", escolha a linha e a coluna em que deseja jogar(0-2): ");
			while(!validador) {
				while(!linhaCorreta) {
					System.out.print("Linha: ");
					linha = scan.nextInt();
					if(linha<0 || linha>2) {
						linhaCorreta = false;
						System.out.println("Linha incorreta! Informe uma linha entre 0 e 2:");
					} else {
						linhaCorreta = true;
					}
				}
				linhaCorreta = false;
							
				while(!colunaCorreta) {
					System.out.print("Coluna: ");
					coluna = scan.nextInt();
					if(coluna<0 || coluna>2) {
						colunaCorreta = false;
						System.out.println("Coluna incorreta! Informe uma coluna entre 0 e 2:");
					} else {
						colunaCorreta = true;
					}
				}
				colunaCorreta = false;

				if(tabuleiro.getTabuleiro()[linha][coluna] == "X" || tabuleiro.getTabuleiro()[linha][coluna] == "O") {
					System.out.println("Jogada inválida! Posição já ocupada!");
					validador = false;
				} else {
					validador = true;
				}
			}
			validador = false;
			
			for(int i=linha; i< tabuleiro.getTabuleiro().length; i++) {
				for(int j = coluna; j<tabuleiro.getTabuleiro()[i].length; j++) {
					tabuleiro.getTabuleiro()[i][j] = tabuleiro.getLetra();
					tabuleiro.setCount(tabuleiro.getCount()+1);
					break;
				}
				break;
			}
			
			if(tabuleiro.getCount() % 2 == 0) {
				tabuleiro.setLetra("X");
				tabuleiro.setJogador(1);
			} else {
				tabuleiro.setLetra("O");
				tabuleiro.setJogador(2);
			}
			

			tabuleiro.verificarGanhador();
		}
		
		if(tabuleiro.getJogador() == 1) {
			System.out.println("O jogador " + tabuleiro.getJogador1() + " ganhou!");
		} else if(tabuleiro.getJogador() == 2) {
			System.out.println("O jogador " + tabuleiro.getJogador2() + " ganhou!");
		} else {
			System.out.println("Jogo empatado!");
		}
		tabuleiro.mostrarTabuleiro();
	}
}