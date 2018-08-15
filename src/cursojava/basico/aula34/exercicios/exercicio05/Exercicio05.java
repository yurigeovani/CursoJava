package cursojava.basico.aula34.exercicios.exercicio05;

public class Exercicio05 {

	public static void main(String[] args) {

//		5. Escreva	a	classe	ConversaoDeUnidadesDeVolume	com	métodos	estáticos	
//		para	conversão	das	unidades	de	volume	segundo	a	lista	abaixo.		
//		• 1	litro	=	1000	centímetros	cúbicos	
//		• 1	metro	cúbico	=	1000	litros	
//		• 1	metro	cúbico	=	35.32	pés	cúbicos	
//		• 1	galão	americano =	231	polegadas	cúbicas	
//		• 1	galão	americano	=	3.785	litros	
		
		
		System.out.println("Litro para centímetros: " + ConversaoDeUnidadesDeVolume.litroCentimetro(12));
		System.out.println("Metro cúbico para litro: " + ConversaoDeUnidadesDeVolume.metroLitro(13));
		System.out.println("Metro cúbico para pés cúbicos: " + ConversaoDeUnidadesDeVolume.metroPes(16));
		System.out.println("Galão americano para polegadas: " + ConversaoDeUnidadesDeVolume.galaoAmericanoPolegadas(15));
		System.out.println("Galão americano para litros: " + ConversaoDeUnidadesDeVolume.galaoAmericanoLitro(28));
	}
}
