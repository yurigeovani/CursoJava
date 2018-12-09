package cursojava.basico.aula47;

public class Aula47 {

	public static void main(String[] args) {

		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			
			System.out.println("Este texto n�o ser� impresso");
			
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exce��o ao acessar um �ndice do vetor que n�o existe!");
		}
		System.out.println("Este texto ser� impresso ap�s a exception");		
	}
}