package cursojava.basico.aula27.exercicios.cursoemvideo.exercicio03;

public class Fatorial {

	private int fat = 1;
	private String formula = "";
	
	public void setValor(int n) {
		int f = 1;
		String s = "";
		for(int i = n; i>1; i--) {
			f *= i;
			s += i + " x ";
		}
		s += "1 = ";
		fat = f;
		formula = s;
	}
	
	public int getFatorial() {
		return fat;
	}
	
	public String getFormula() {
		return formula;
	}
}