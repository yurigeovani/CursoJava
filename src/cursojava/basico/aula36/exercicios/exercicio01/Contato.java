package cursojava.basico.aula36.exercicios.exercicio01;

public class Contato {
	private static String nome;
	private static String telefone;
	private static String email;
	
	public Contato() {
	}

	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Contato.nome = nome;
	}
	public static String getTelefone() {
		return telefone;
	}
	public static void setTelefone(String telefone) {
		Contato.telefone = telefone;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		Contato.email = email;
	}
	
}
