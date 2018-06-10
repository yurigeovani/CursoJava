package cursojava.basico.aula16;

public class LoopWhile {

	public static void main(String[] args) {

		int i = 1;
		
		int max = 10;
		
		System.out.println("Contando até " + max + "!");
		
		while (i<=max) {
			
			System.out.println("O valor de i " + i);
			i++;
			
		}
		
		System.out.println("I fora do WHILE " + i); // i = 11
		
		do {
			i++;
			System.out.println("Valor de i " + i);
		} while (i<13);
		
		System.out.println("I fora do DO WHILE " + i);

	}
}
