package cursojava.basico.aula34.exercicios.exercicio03;

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
	
	public static int fatorial (int num) { //Se quiser mostrar o cálculo completo, basta descomentar
		setResultado(num);
		//System.out.print("O fatorial de " + getResultado() + " é: " + getResultado() + "! = " + getResultado());
		for(int i = num-1;i>1;i--) {
			setResultado(getResultado()*i);
		//	System.out.print(" x " + i);
		}
		//System.out.println(" x 1 = " + getResultado());
		return (int) getResultado();
	}
}