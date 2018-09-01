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
	
	public void mostrarOpcoes() {
		System.out.println("###########  MENU  ###########");
		System.out.println("1) Cadastrar contato;");
		System.out.println("2) Consultar contato;");
		System.out.println("3) Listar todos contatos;");
		System.out.println("0) SAIR;");
	}
		
	public void consultarContato(String nome) {
		boolean sair = false;
		for(int i=0; i<contatos.length;i++) {
			if(contatos[i]!=null && contatos[i].getNome()!=null && nome.equalsIgnoreCase(contatos[i].getNome())) {
				System.out.println(i+1 + ")	Nome: " + contatos[i].getNome());
				System.out.println("	Fone: " + contatos[i].getTelefone());
				System.out.println("	Email: " + contatos[i].getEmail());
				sair = true;
			}
		}
	}
		
	public void listarTodosContatos() {
		boolean sair = false;
		for(int i=0; i<contatos.length;i++) {
			if(contatos[i]!=null && contatos[i].getNome()!=null) {
				System.out.println(i+1 + ")	Nome: " + contatos[i].getNome());
				sair = true;
			}
			if(contatos[i]!=null && contatos[i].getTelefone()!=null) {
				System.out.println("	Fone: " + contatos[i].getTelefone());
			}
			if(contatos[i]!=null && contatos[i].getEmail()!=null) {
				System.out.println("	Email: " + contatos[i].getEmail());
			}
		}
		if(!sair){
			System.out.println("Agenda sem contatos!");
		}
	}
}