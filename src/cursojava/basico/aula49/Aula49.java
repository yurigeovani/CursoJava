package cursojava.basico.aula49;

public class Aula49 {

	public static void main(String[] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for(int i=0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));	
			}
			//Exemplo de Try Catch
			catch(ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero!");
				System.exit(0);
			}
			//Exemplo de Try Catch
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("Posi��o do array inv�lida!");
				System.exit(0);
			}
			finally{
				System.out.println("Essa linha � impressa sempre ap�s o try e catch!");
			}
		}
	}
}