package cursojava.basico.aula27.exercicios.exercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		JogoDaVelha tabuleiro = new JogoDaVelha();
		
		int linha = 0, coluna = 0;
		boolean linhaCorreta = false, colunaCorreta = false, validador = false;
		
		System.out.println("Informe o nome dos jogadores: ");
		System.out.print("Jogador 1: ");
		tabuleiro.jogador1 = scan.next();
		System.out.print("Jogador 2: ");
		tabuleiro.jogador2 = scan.next();

		tabuleiro.comecarPartida();
		
		while(!tabuleiro.verificarGanhador()) {

			tabuleiro.mostrarTabuleiro();
			
			System.out.println("Jogador " + tabuleiro.jogador + ", escolha a linha e a coluna em que deseja jogar(0-2): ");
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

				if(tabuleiro.tabuleiro[linha][coluna] == "X" || tabuleiro.tabuleiro[linha][coluna] == "O") {
					System.out.println("Jogada inválida! Posição já ocupada!");
					validador = false;
				} else {
					validador = true;
				}
			}
			validador = false;
			
			for(int i=linha; i< tabuleiro.tabuleiro.length; i++) {
				for(int j = coluna; j<tabuleiro.tabuleiro[i].length; j++) {
					tabuleiro.tabuleiro[i][j] = tabuleiro.letra;
					tabuleiro.count++;
					break;
				}
				break;
			}
			
			if(tabuleiro.count % 2 == 0) {
				tabuleiro.letra = "X";
				tabuleiro.jogador = 1;
			} else {
				tabuleiro.letra = "O";
				tabuleiro.jogador = 2;
			}
			

			tabuleiro.verificarGanhador();
		}
		
		if(tabuleiro.jogador == 1) {
			System.out.println("O jogador " + tabuleiro.jogador1 + " ganhou!");
		} else if(tabuleiro.jogador == 2) {
			System.out.println("O jogador " + tabuleiro.jogador2 + " ganhou!");
		} else {
			System.out.println("Jogo empatado!");
		}
		tabuleiro.mostrarTabuleiro();
	}

}