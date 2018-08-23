package cursojava.basico.aula36.exercicios.exercicio01;

public class Agenda {
	private String nome;
	private Contato[] contatos = new Contato[2];
	
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
	
	public void cadastrarContato(int id, String nome, String telefone, String email) {
		contatos[id].setNome(nome);
		contatos[id].setNome(telefone);
		contatos[id].setNome(email);
		
	}
	
	public void consultarContato(String nome) {
		for (int i=0;i<contatos.length;i++) {
			if(nome.equalsIgnoreCase(contatos[i].getNome())) {
				contatos[i].getNome();
				contatos[i].getTelefone();
				contatos[i].getEmail();
			}
		}
	}
	
	public void listarTodosContatos() {
		for(Contato c : getContatos()) {
			System.out.println("Nome: " + c.getNome());
			System.out.println("Fone: " + c.getTelefone());
			System.out.println("Email: " + c.getEmail());
		}
	}
}