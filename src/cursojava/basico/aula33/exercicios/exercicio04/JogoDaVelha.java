package cursojava.basico.aula33.exercicios.exercicio04;

	class JogoDaVelha {

	private String[][] tabuleiro = new String[3][3];
	private String letra, jogador1, jogador2;
	private int jogador;
	private int count;
	
	public JogoDaVelha() {
	}

	public JogoDaVelha(String[][] tabuleiro, String letra, String jogador1, String jogador2, int jogador, int count) {
		this.tabuleiro = tabuleiro;
		this.letra = letra;
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
		this.jogador = jogador;
		this.count = count;
	}

	public String[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(String[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public String getJogador1() {
		return jogador1;
	}

	public void setJogador1(String jogador1) {
		this.jogador1 = jogador1;
	}

	public String getJogador2() {
		return jogador2;
	}

	public void setJogador2(String jogador2) {
		this.jogador2 = jogador2;
	}

	public int getJogador() {
		return jogador;
	}

	public void setJogador(int jogador) {
		this.jogador = jogador;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	public void comecarPartida() {
		setCount((int)Math.round(Math.random() * 1));
		
		if(getCount()==0) {
			System.out.println("O jogador " + jogador1 + " começará a partida! Utilizará o \"X\".");
			setLetra("X");
			setJogador(1);
		} else {
			System.out.println("O jogador " + jogador2 + " começará a partida! Utilizará o \"O\".");			
			setLetra("O");
			setJogador(2);
		}
	}

	public void mostrarTabuleiro() {
		for(int i=0; i< getTabuleiro().length; i++) {
			for(int j = 0; j<getTabuleiro()[i].length; j++) {
				System.out.print(getTabuleiro()[i][j]);
				if(j<getTabuleiro()[i].length-1) {
					System.out.print("  |  ");
				}
			}
			System.out.println("");
			if(i<getTabuleiro().length-1) {
				System.out.println("_______________________");
			}
		}
	}
	
	public boolean verificarGanhador() {
		boolean gameOver=false;
		if(	(getTabuleiro()[0][0] == "X" && getTabuleiro()[0][1] == "X" && getTabuleiro()[0][2] == "X") ||
				(getTabuleiro()[1][0] == "X" && getTabuleiro()[1][1] == "X" && getTabuleiro()[1][2] == "X") ||
				(getTabuleiro()[2][0] == "X" && getTabuleiro()[2][1] == "X" && getTabuleiro()[2][2] == "X") ||
				(getTabuleiro()[0][0] == "X" && getTabuleiro()[1][0] == "X" && getTabuleiro()[2][0] == "X") ||
				(getTabuleiro()[0][1] == "X" && getTabuleiro()[1][1] == "X" && getTabuleiro()[2][1] == "X") ||
				(getTabuleiro()[0][2] == "X" && getTabuleiro()[1][2] == "X" && getTabuleiro()[2][2] == "X") ||
				(getTabuleiro()[0][0] == "X" && getTabuleiro()[1][1] == "X" && getTabuleiro()[2][2] == "X") ||
				(getTabuleiro()[0][2] == "X" && getTabuleiro()[1][1] == "X" && getTabuleiro()[2][0] == "X") ) {
			setJogador(1);
			gameOver = true;
			} else if ( (getTabuleiro()[0][0] == "O" && getTabuleiro()[0][1] == "O" && getTabuleiro()[0][2] == "O") ||
						(getTabuleiro()[1][0] == "O" && getTabuleiro()[1][1] == "O" && getTabuleiro()[1][2] == "O") ||
						(getTabuleiro()[2][0] == "O" && getTabuleiro()[2][1] == "O" && getTabuleiro()[2][2] == "O") ||
						(getTabuleiro()[0][0] == "O" && getTabuleiro()[1][0] == "O" && getTabuleiro()[2][0] == "O") ||
						(getTabuleiro()[0][1] == "O" && getTabuleiro()[1][1] == "O" && getTabuleiro()[2][1] == "O") ||
						(getTabuleiro()[0][2] == "O" && getTabuleiro()[1][2] == "O" && getTabuleiro()[2][2] == "O") ||
						(getTabuleiro()[0][0] == "O" && getTabuleiro()[1][1] == "O" && getTabuleiro()[2][2] == "O") ||
						(getTabuleiro()[0][2] == "O" && getTabuleiro()[1][1] == "O" && getTabuleiro()[2][0] == "O") ) {
				setJogador(2);
				gameOver = true;
			} else if(getCount()==9) {
				setJogador(3);
				gameOver = true;
			}
		return gameOver;
	}

}