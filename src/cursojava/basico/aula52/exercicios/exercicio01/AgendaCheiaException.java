package cursojava.basico.aula52.exercicios.exercicio01;

public class AgendaCheiaException extends Exception {

	@Override
	public String getMessage() {
		return "Agenda já está cheia!";
	}
}
