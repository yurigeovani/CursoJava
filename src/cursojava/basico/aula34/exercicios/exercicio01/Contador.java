package cursojava.basico.aula34.exercicios.exercicio01;

public class Contador {

	private static int cont;
	
	public Contador() {
		this.cont++;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int numero) {
		Contador.cont = numero;
	}
	
	
	public static void incrementar() {
		setCont(getCont()+1);
	}
	
	public static void zerar() {
		setCont(0);
	}
	
	public static int obterValor() {
		return getCont();
	}
}
