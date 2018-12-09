package cursojava.basico.aula46.exercicios.exercicio02;

public class Circulo extends Figura2D{

	private double raio;

	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return Math.pow(raio, 2) * Math.PI;
	}
}