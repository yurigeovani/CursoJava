package cursojava.basico.aula35;

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
	
	public static int fatorialNaoRecursivo (int num) { //Se quiser mostrar o c�lculo completo, basta descomentar
		setResultado(num);
		//System.out.print("O fatorial de " + getResultado() + " �: " + getResultado() + "! = " + getResultado());
		for(int i = num-1;i>1;i--) {
			setResultado(getResultado()*i);
		//	System.out.print(" x " + i);
		}
		//System.out.println(" x 1 = " + getResultado());
		return (int) getResultado();
	}
	
	//5!=5x4!, 4!=4x3!, 3!=3x2!, 2!=2x1!, 1!=1x0!, 0!=1
	public static int fatorial(int num) {
		if(num==0) {
			return 1;
		}
		return num*fatorial(num-1);
	}
}