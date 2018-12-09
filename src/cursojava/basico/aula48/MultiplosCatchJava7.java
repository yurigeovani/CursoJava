package cursojava.basico.aula48;

public class MultiplosCatchJava7 {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i] / denom[i]));
			}
			// Exemplo de Try Catch
			catch (ArithmeticException | ArrayIndexOutOfBoundsException e1) {
				System.out.println("Aconteceu um erro!");
			}
		}
	}
}