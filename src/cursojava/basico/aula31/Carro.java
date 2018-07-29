package cursojava.basico.aula31;

public class Carro {

	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
	}
	
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado!");
		return this.capCombustivel*this.consumoCombustivel;
	}
	
	private double divideKMPoConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		return this.divideKMPoConsumoCombustivel(km);
	}

}
