package cursojava.basico.aula34.exercicios.exercicio02;

public class Calculadora {

	private static double resultado;
	
	
	public Calculadora() {
	}

	
	public static double getResultado() {
		return resultado;
	}

	public static void setResultado(double resultado) {
		Calculadora.resultado = resultado;
	}


	public static double somar(double num1, double num2) {
		setResultado(num1+num2);
		return getResultado();
	}

	public static double subtrair(double num1, double num2) {
		setResultado(num1-num2);
		return getResultado();
	}

	public static double multiplicar(double num1, double num2) {
		setResultado(num1*num2);
		return getResultado();
	}

	public static double dividir(double num1, double num2) {
		setResultado(num1/num2);
		return getResultado();
	}

	public static double elevar(double num1, double n) {
		setResultado(Math.pow(num1, n));
		return getResultado();
	}
}