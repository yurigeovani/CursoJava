package cursojava.basico.aula34.exercicios.exercicio05;

public class ConversaoDeUnidadesDeVolume {

	private static double resultado;
	
	
	public ConversaoDeUnidadesDeVolume() {
	}

	
	public static double getResultado() {
		return resultado;
	}
	public static void setResultado(double resultado) {
		ConversaoDeUnidadesDeVolume.resultado = resultado;
	}

	
	//� 1	litro	=	1000	cent�metros	c�bicos
	public static double litroCentimetro(double medida) {
		setResultado(medida*1000);
		return getResultado();
	}

	//1	metro	c�bico	=	1000	litros
	public static double metroLitro(double medida) { 
		setResultado(medida*1000);
		return getResultado();
	}
	
	//1	metro	c�bico	=	35.32	p�s	c�bicos
	public static double metroPes(double medida) { 
		setResultado(medida*35.31468);
		return getResultado();
	}
	
	//1	gal�o	americano =	231	polegadas	c�bicas
	public static double galaoAmericanoPolegadas(double medida) { 
		setResultado(medida*230.99993111);
		//setResultado(medida*2.3099993111*Math.pow(10, 2));
		return getResultado();
	}
	
	//1	gal�o	americano	=	3.785	litros
	public static double galaoAmericanoLitro(double medida) { 
		setResultado(medida*3.7854096684);
		return getResultado();
	}
}
