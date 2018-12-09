package cursojava.basico.aula43.exercicios.exercicio03;

public class Mamifero extends Animal {
	private String alimento;

	public String getAlimento() {
		return alimento;
	}
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return "Animal: " + getNome() +
				"\nComprimento: " + getComprimento() + " cm" +
				"\nPatas: " + getPatas() +
				"\nCor: " + getCor() + 
				"\nAmbiente: " + getAmbiente() + 
				"\nVelocidade: " + getVelocidade() + " m/s" +
				"\nAlimento: " + getAlimento();
	}
}