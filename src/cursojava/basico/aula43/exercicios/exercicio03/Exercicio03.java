package cursojava.basico.aula43.exercicios.exercicio03;

public class Exercicio03 {

	public static void main(String[] args) {

		Mamifero camelo = new Mamifero();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2);
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		tubarao.setCaracteristicas("Barbatanas e cauda");
		
		Mamifero ursoDoCanada = new Mamifero();
		ursoDoCanada.setNome("Urso-Do-Canadá");
		ursoDoCanada.setComprimento(180);
		ursoDoCanada.setCor("Vermelho");
		ursoDoCanada.setAmbiente("Terra");
		ursoDoCanada.setVelocidade(0.5);
		ursoDoCanada.setAlimento("Mel");
		
		Animal[] animais = new Animal[3];
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = ursoDoCanada;
		
		for(Animal animal : animais) {
			System.out.println("---------------------------------");
			System.out.println(animal);
		}
		System.out.println("---------------------------------");
	}
}