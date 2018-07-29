package cursojava.basico.aula27.exercicios.exercicio04;

public class JogoDaVelha {

	String[][] tabuleiro = new String[3][3];
	String letra, jogador1, jogador2;
	int jogador;
	int count;
	
	
	void comecarPartida() {
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
	}
	
	void mostrarTabuleiro() {
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
	
	boolean verificarGanhador() {
		boolean gameOver=false;
		if(	(tabuleiro[0][0] == "X" && tabuleiro[0][1] == "X" && tabuleiro[0][2] == "X") ||
				(tabuleiro[1][0] == "X" && tabuleiro[1][1] == "X" && tabuleiro[1][2] == "X") ||
				(tabuleiro[2][0] == "X" && tabuleiro[2][1] == "X" && tabuleiro[2][2] == "X") ||
				(tabuleiro[0][0] == "X" && tabuleiro[1][0] == "X" && tabuleiro[2][0] == "X") ||
				(tabuleiro[0][1] == "X" && tabuleiro[1][1] == "X" && tabuleiro[2][1] == "X") ||
				(tabuleiro[0][2] == "X" && tabuleiro[1][2] == "X" && tabuleiro[2][2] == "X") ||
				(tabuleiro[0][0] == "X" && tabuleiro[1][1] == "X" && tabuleiro[2][2] == "X") ||
				(tabuleiro[0][2] == "X" && tabuleiro[1][1] == "X" && tabuleiro[2][0] == "X") ) {
			jogador = 1;
			gameOver = true;
			} else if ( (tabuleiro[0][0] == "O" && tabuleiro[0][1] == "O" && tabuleiro[0][2] == "O") ||
						(tabuleiro[1][0] == "O" && tabuleiro[1][1] == "O" && tabuleiro[1][2] == "O") ||
						(tabuleiro[2][0] == "O" && tabuleiro[2][1] == "O" && tabuleiro[2][2] == "O") ||
						(tabuleiro[0][0] == "O" && tabuleiro[1][0] == "O" && tabuleiro[2][0] == "O") ||
						(tabuleiro[0][1] == "O" && tabuleiro[1][1] == "O" && tabuleiro[2][1] == "O") ||
						(tabuleiro[0][2] == "O" && tabuleiro[1][2] == "O" && tabuleiro[2][2] == "O") ||
						(tabuleiro[0][0] == "O" && tabuleiro[1][1] == "O" && tabuleiro[2][2] == "O") ||
						(tabuleiro[0][2] == "O" && tabuleiro[1][1] == "O" && tabuleiro[2][0] == "O") ) {
				jogador = 2;
				gameOver = true;
			} else if(count==9) {
				jogador = 3;
				gameOver = true;
			}
		return gameOver;
	}

}