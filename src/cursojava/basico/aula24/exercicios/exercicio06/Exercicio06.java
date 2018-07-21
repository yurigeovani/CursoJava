package cursojava.basico.aula24.exercicios.exercicio06;

public class Exercicio06 {

	public static void main(String[] args) {

//		6. Crie uma classe que represente um contato da agenda do seu celular.
		
		Agenda contato = new Agenda();
		contato.nome = "Yuri";
		contato.email = "yuri@gmail.com";
		
		contato.telefones = new String[2];
		contato.telefones[0]="85988888888";
		contato.telefones[1]="85999999999";
		
		System.out.println("Telefone do " + contato.nome + " é " + contato.telefones[0] + " e " + contato.telefones[1]);
	}

}
