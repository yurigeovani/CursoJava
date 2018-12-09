package cursojava.basico.aula46.exercicios.exercicio02;

public class Cilindro extends Figura3D{

	private double altura;
	private double raio;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		double areaBase = Math.pow(raio, 2)*Math.PI;
		double areaLateral = 2*Math.PI*raio*altura;
		return 2*areaBase+areaLateral;
	}
	@Override
	public double calcularVolume() {
		return Math.pow(raio, 2)*Math.PI*altura;
	}	
}