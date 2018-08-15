package cursojava.basico.aula34.exercicios.exercicio04;

public class ConversaoDeUnidadesDeArea {
	
	private static double resultado;

	public ConversaoDeUnidadesDeArea() {
	}

	public static double getResultado() {
		return resultado;
	}

	public static void setResultado(double resultado) {
		ConversaoDeUnidadesDeArea.resultado = resultado;
	}

	//1	metro	quadrado	=	10.7639	pés	quadrados
	static double metroPes (double medida) {
		setResultado(medida*10.7639);;
		return getResultado();
	}
	
	//1	pé	quadrado	=	929.0304	centímetros	quadrados	
	static double pesCentimetros(double medida) {
		setResultado(medida*929.0304);
		return getResultado();
	}
	
	//	• 1	milha	quadrada	=	639,9979	acres
	static double milhaAcres(double medida) { 
		setResultado(medida*639.9979);
		return getResultado();
	}
	
	//	• 1	acre	=	43.560,1462	pés	quadrados
	static double acrePes (double medida) {
		setResultado(medida*43560.1462);
		return getResultado();
	}
}
