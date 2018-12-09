package cursojava.basico.aula43.exercicios.exercicio03;

public class Peixe extends Animal {

	private String caracteristicas;
	
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	public Peixe() {
		super();
		super.setPatas(0);
		super.setAmbiente("Mar");
		super.setCor("Cinzento");
	}
	
	@Override
	public String toString() {
		return "Animal: " + getNome() +
				"\nComprimento: " + getComprimento() + " cm" +
				"\nPatas: " + getPatas() +
				"\nCor: " + getCor() + 
				"\nAmbiente: " + getAmbiente() + 
				"\nVelocidade: " + getVelocidade() + " m/s" + 
				"\nCaracterísticas: " + getCaracteristicas();
	}
}