package cursojava.basico.aula34.exercicios.exercicio04;

public class Exercicio04 {

	public static void main(String[] args) {

		//4. Escreva	a	classe	ConversaoDeUnidadesDeArea	com	m�todos	est�ticos	
//			para	convers�o	das	unidades	de	�rea	segundo	a	lista	abaixo.		
//			� 1	metro	quadrado	=	10.76	p�s	quadrados	
//			� 1	p�	quadrado	=	929	cent�metros	quadrados	
//			� 1	milha	quadrada	=	640	acres	
//			� 1	acre	=	43.560	p�s	quadrados
		
		System.out.println("Metro para p�s: " + ConversaoDeUnidadesDeArea.metroPes(17));;
		System.out.println("P�s para cent�metros: " + ConversaoDeUnidadesDeArea.pesCentimetros(12));
		System.out.println("Milha para acre: " + ConversaoDeUnidadesDeArea.milhaAcres(14));
		System.out.println("Acres para p�s: " + ConversaoDeUnidadesDeArea.acrePes(9));
		
	}
}