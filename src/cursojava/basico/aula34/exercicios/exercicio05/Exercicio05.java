package cursojava.basico.aula34.exercicios.exercicio05;

public class Exercicio05 {

	public static void main(String[] args) {

//		5. Escreva	a	classe	ConversaoDeUnidadesDeVolume	com	m�todos	est�ticos	
//		para	convers�o	das	unidades	de	volume	segundo	a	lista	abaixo.		
//		� 1	litro	=	1000	cent�metros	c�bicos	
//		� 1	metro	c�bico	=	1000	litros	
//		� 1	metro	c�bico	=	35.32	p�s	c�bicos	
//		� 1	gal�o	americano =	231	polegadas	c�bicas	
//		� 1	gal�o	americano	=	3.785	litros	
		
		
		System.out.println("Litro para cent�metros: " + ConversaoDeUnidadesDeVolume.litroCentimetro(12));
		System.out.println("Metro c�bico para litro: " + ConversaoDeUnidadesDeVolume.metroLitro(13));
		System.out.println("Metro c�bico para p�s c�bicos: " + ConversaoDeUnidadesDeVolume.metroPes(16));
		System.out.println("Gal�o americano para polegadas: " + ConversaoDeUnidadesDeVolume.galaoAmericanoPolegadas(15));
		System.out.println("Gal�o americano para litros: " + ConversaoDeUnidadesDeVolume.galaoAmericanoLitro(28));
	}
}
