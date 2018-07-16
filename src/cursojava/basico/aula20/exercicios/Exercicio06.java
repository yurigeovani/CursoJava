package cursojava.basico.aula20.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

//		6. Faça um programa para jogar o jogo da velha. O programa deve
//		permitir que dois jogadores façam uma partida do jogo da velha,
//		usando o computador para ver o tabuleiro. Cada jogador vai
//		alternadamente informando a posição onde deseja colocar a sua
//		peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
//		determinar automaticamente quando o jogo terminou e quem foi o
//		vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
//		deve atualizar a situação do tabuleiro na tela.
		
		Scanner scan = new Scanner(System.in);
		
		String[][] tabuleiro = new String[3][3];
		String jogador1, jogador2, letra;
		int jogador, count, linha = 0, coluna = 0;
		boolean gameOver = false, linhaCorreta = false, colunaCorreta = false;
		
		System.out.println("Informe o nome dos jogadores: ");
		System.out.print("Jogador 1: ");
		jogador1 = scan.next();
		System.out.print("Jogador 2: ");
		jogador2 = scan.next();
				
		count = (int)Math.round(Math.random() * 1);
		
		if(count == 0) {
			System.out.println("O jogador " + jogador1 + " começará a partida! Utilizará o \"X\".");
			letra = "X";
			jogador = 1;
		} else {
			System.out.println("O jogador " + jogador2 + " começará a partida! Utilizará o \"O\".");			
			letra = "O";
			jogador = 2;
		}
		
		while(!gameOver) {
			for(int i=0; i< tabuleiro.length; i++) {
				for(int j = 0; j<tabuleiro[i].length; j++) {
					System.out.print(tabuleiro[i][j]);
					if(j<tabuleiro[i].length-1) {
						System.out.print("  |  ");
					}
				}
				System.out.println("");
				if(i<tabuleiro.length-1) {
					System.out.println("_______________________");
				}

			}

			System.out.println("Jogador " + jogador + ", escolha a linha e a coluna em que deseja jogar(0-2): ");
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

			for(int i=linha; i< tabuleiro.length; i++) {
				for(int j = coluna; j<tabuleiro[i].length; j++) {
					tabuleiro[i][j] = letra;
					count++;
					break;
				}
				break;
			}
			
			if(count % 2 == 0) {
				letra = "X";
				jogador = 1;
			} else {
				letra = "O";
				jogador = 2;
			}
			
			if(	(tabuleiro[0][0] == "X" && tabuleiro[0][1] == "X" && tabuleiro[0][2] == "X") ||
				(tabuleiro[1][0] == "X" && tabuleiro[1][1] == "X" && tabuleiro[1][2] == "X") ||
				(tabuleiro[2][0] == "X" && tabuleiro[2][1] == "X" && tabuleiro[2][2] == "X") ||
				(tabuleiro[0][0] == "X" && tabuleiro[1][0] == "X" && tabuleiro[2][0] == "X") ||
				(tabuleiro[0][1] == "X" && tabuleiro[1][1] == "X" && tabuleiro[2][1] == "X") ||
				(tabuleiro[0][2] == "X" && tabuleiro[1][2] == "X" && tabuleiro[2][2] == "X") ||
				(tabuleiro[0][0] == "X" && tabuleiro[1][1] == "X" && tabuleiro[2][2] == "X") ||
				(tabuleiro[0][2] == "X" && tabuleiro[1][1] == "X" && tabuleiro[2][0] == "X") ) {
				gameOver = true;
				jogador = 1;
			} else if ( (tabuleiro[0][0] == "O" && tabuleiro[0][1] == "O" && tabuleiro[0][2] == "O") ||
						(tabuleiro[1][0] == "O" && tabuleiro[1][1] == "O" && tabuleiro[1][2] == "O") ||
						(tabuleiro[2][0] == "O" && tabuleiro[2][1] == "O" && tabuleiro[2][2] == "O") ||
						(tabuleiro[0][0] == "O" && tabuleiro[1][0] == "O" && tabuleiro[2][0] == "O") ||
						(tabuleiro[0][1] == "O" && tabuleiro[1][1] == "O" && tabuleiro[2][1] == "O") ||
						(tabuleiro[0][2] == "O" && tabuleiro[1][2] == "O" && tabuleiro[2][2] == "O") ||
						(tabuleiro[0][0] == "O" && tabuleiro[1][1] == "O" && tabuleiro[2][2] == "O") ||
						(tabuleiro[0][2] == "O" && tabuleiro[1][1] == "O" && tabuleiro[2][0] == "O") ) {
				gameOver = true;
				jogador = 2;
			}

		}
		
		System.out.println("O jogador " + jogador + " ganhou!");
		for(int i=0; i< tabuleiro.length; i++) {
			for(int j = 0; j<tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j]);
				if(j<tabuleiro[i].length-1) {
					System.out.print("  |  ");
				}
			}
			System.out.println("");
			if(i<tabuleiro.length-1) {
				System.out.println("_______________________");
			}

		}
		
	}

}