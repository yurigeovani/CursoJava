package cursojava.basico.aula52.exercicios.exercicio01;

public class Contato {

	private int id;
	private String nome;
	private String fone;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public Contato(int id, String nome, String fone) {
		super();
		this.id = id;
		this.nome = nome;
		this.fone = fone;
	}
	
	public Contato() {
		super();
	}
	
	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", fone=" + fone + "]";
	}
}