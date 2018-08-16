package cursojava.basico.aula36.exercicios.exercicio01;

public class Agenda {
	private static String nome;
	private static Contato[] contato;
	
	public Agenda() {
	}

	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Agenda.nome = nome;
	}
	public static Contato[] getContato() {
		return contato;
	}
	public static void setContato(Contato[] contato) {
		Agenda.contato = contato;
	}	
	
	public static String mostrarContato(String nome) {
		for(int i=0; i<getContato().length;i++) {
			if(getContato()[i].getNome()==nome) {
				return getContato();
			}
		}
		return getContato();
	}
}
