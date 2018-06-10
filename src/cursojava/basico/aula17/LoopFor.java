package cursojava.basico.aula17;

public class LoopFor {

	public static void main(String[] args) {

		for (int i=0; i<5; i++) {
			System.out.println("Valor de i " + i);
		}
		
		for (int i = 5; i>0; i--) {
			System.out.println("Valor de i " + i);
		}
		
		for (int i = 0, j = 10;i<=j;i++, j--) {
			System.out.println("i = " +i + ", j = " + j);
		}
		
		int cont = 0;
		
		for (;cont<10;) {
			System.out.println("Valor de count = " + cont);
			cont +=2;
		}
		
		for (cont = 0;cont<10;cont +=2) {
			System.out.println("Valor de cont = " + cont);
		}
		
		int soma = 0;
		
		for  (int i = 1; i<5; soma += i++) {
			System.out.println("O valor de i= " + i);
			System.out.println("O valor de soma= " + soma);
		}
		System.out.println("Valor da soma " + soma);
	}

}
