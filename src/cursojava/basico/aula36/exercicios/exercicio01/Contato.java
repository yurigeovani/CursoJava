package cursojava.basico.aula36.exercicios.exercicio01;

public class Contato {

	private String nome;
	private String fone;
	private String email;
	
	public Contato() {
	}

	public Contato(String nome, String fone, String email) {
		super();
		this.nome = nome;
		this.fone = fone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}