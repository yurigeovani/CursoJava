package cursojava.basico.aula34.exercicios.exercicio04;

public class Exercicio04 {

	public static void main(String[] args) {

		//4. Escreva	a	classe	ConversaoDeUnidadesDeArea	com	métodos	estáticos	
//			para	conversão	das	unidades	de	área	segundo	a	lista	abaixo.		
//			• 1	metro	quadrado	=	10.76	pés	quadrados	
//			• 1	pé	quadrado	=	929	centímetros	quadrados	
//			• 1	milha	quadrada	=	640	acres	
//			• 1	acre	=	43.560	pés	quadrados
		
		System.out.println("Metro para pés: " + ConversaoDeUnidadesDeArea.metroPes(17));;
		System.out.println("Pés para centímetros: " + ConversaoDeUnidadesDeArea.pesCentimetros(12));
		System.out.println("Milha para acre: " + ConversaoDeUnidadesDeArea.milhaAcres(14));
		System.out.println("Acres para pés: " + ConversaoDeUnidadesDeArea.acrePes(9));
		
	}
}