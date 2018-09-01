package cursojava.basico.aula36.exercicios.exercicio03;

public class Agenda {

	private String nome;
	private Contato[] contatos;
	
	public Agenda() {
	}
	public Agenda(String nome, Contato[] contatos) {
		super();
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
		System.out.println("##################### OPÇÕES #####################");
		System.out.println("1) Cadastrar;");
		System.out.println("2) Consultar;");
		System.out.println("3) Listar todos;");
		System.out.println("0) Sair;");
		System.out.print("Informe a opção desejada: ");
	}

	public void consultarContato(String nome) {
		for(Contato c : contatos) {
			if(contatos!=null && nome.equalsIgnoreCase(c.getNome())) {
				System.out.println("Nome: " + c.getNome());
				System.out.println("Fone: " + c.getFone());
				System.out.println("Email: " + c.getEmail());
			}
		}
		System.out.println("Nenhum contato encontrado!");
	}
	
	public void listarContatos() {
		for (Contato c : contatos) {
			if(contatos!=null && c.getNome()!=null) {
				System.out.println("Nome: " + c.getNome());
			}
			if(contatos!=null && c.getFone()!=null) {
				System.out.println("Fone: " + c.getFone());
			}
			if(contatos!=null && c.getEmail()!=null) {
				System.out.println("Email: " + c.getEmail());
			}
		}
	}
}