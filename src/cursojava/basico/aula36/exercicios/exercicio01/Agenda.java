package cursojava.basico.aula36.exercicios.exercicio01;

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
		int count = 0;
		for(int i=0; i<contatos.length; i++) {
			if(contatos[i]!=null && nome.equalsIgnoreCase(contatos[i].getNome())) {
				System.out.println(i+1 + ")	Nome: " + contatos[i].getNome());
				System.out.println("	Fone: " + contatos[i].getFone());
				System.out.println("	Email: " + contatos[i].getEmail());
				count++;
			}
		}
		if(count==0) {
			System.out.println("Nenhum contato encontrado!");
		}
	}
	
	public void listarContatos() {
		int count = 0;
		for(int i=0; i<contatos.length; i++) {
			if(contatos[i]!=null && contatos[i].getNome()!=null) {
				System.out.println(i+1 + ")	Nome: " + contatos[i].getNome());
				System.out.println("	Fone: " + contatos[i].getFone());
				System.out.println("	Email: " + contatos[i].getEmail());
				count++;
			}
		}
		if(count==0) {
			System.out.println("Nenhum contato cadastrado!");
		}
	}
}