package cursojava.basico.aula35.exercicios.exercicio01;

public class Fibonacci {
	
	private static int termo;

	public Fibonacci() {
	}

	public static int getTermo() {
		return termo;
	}
	public static void setTermo(int termo) {
		Fibonacci.termo = termo;
	}
	
	public static int calcularFibonacci (int num) {
//		if(num==1) {
//			return 1+calcularFibonacci(num-1);
//		} else if(num==0) {
//			return 0;
//		}
		if(num<=2) {
			return 1;
		}
		return calcularFibonacci(num-1)+calcularFibonacci(num-2);
	}
}
