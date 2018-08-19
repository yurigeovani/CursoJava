package cursojava.basico.aula36.exercicios.exercicio01;

public class Agenda {
	private String nome;
	private Contato[] contatos;

	public Agenda() {
	}

	public Agenda(String nome, Contato[] contatos) {
		this.nome = nome;
		this.contatos = contatos;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public void mostrarContato(String nome) {
//		for(int i=0; i<getContato().length; i++) {
//			if(nome==getContato()[i].getNome()) {
//				System.out.println(getContato());
			}
//		}
//	}
}