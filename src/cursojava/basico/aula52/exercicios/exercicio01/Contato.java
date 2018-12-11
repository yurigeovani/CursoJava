package cursojava.basico.aula52.exercicios.exercicio01;

public class Contato {

	private static int contador = 0;
	private int id;
	private String nome;
	private String fone;
	private String email;

	public int getId() {
		return id;
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

	public Contato() {
		contador++;
		id = contador;
	}
	
	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", fone=" + fone + ", email=" + email + "]";
	}
}