package cursojava.basico.aula35.exercicios.exercicio02;

public class Calculadora {
	public static int calcular(int num) {
		if(num==0) {
			return 0;
		}
		return num+calcular(num-1);
	}
}
