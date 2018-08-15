package cursojava.basico.aula34.exercicios.exercicio06;

public class ConversaoDeUnidadesDeTempo {

	private static double resultado;

	
	public ConversaoDeUnidadesDeTempo() {
	}


	public static double getResultado() {
		return resultado;
	}
	public static void setResultado(double resultado) {
		ConversaoDeUnidadesDeTempo.resultado = resultado;
	}
	
	//• 1	minuto	=	60	segundos
	public static double minutoSegundo(double tempo) {
		setResultado(tempo*60);
		return getResultado();
	}

	//• 1	hora	=	60	minutos
	public static double horaMinuto(double tempo) {
		setResultado(tempo*60);
		return getResultado();
	}

	//• 1	dia	=	24	horas
	public static double diaHora(double tempo) {
		setResultado(tempo*24);
		return getResultado();
	}

	//• 1	semana	=	7	dias
	public static double semanaDia(double tempo) {
		setResultado(tempo*7);
		return getResultado();
	}

	//• 1	mês	=	30	dias
	public static double mesDia(double tempo) {
		setResultado(tempo*30.44);
		return getResultado();
	}

	//• 1	ano	=	365.25	dias
	public static double anoDia(double tempo) {
		setResultado(tempo*365.25);
		return getResultado();
	}
}
