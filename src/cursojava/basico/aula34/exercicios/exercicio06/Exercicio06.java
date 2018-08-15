package cursojava.basico.aula34.exercicios.exercicio06;

public class Exercicio06 {

	public static void main(String[] args) {

//		6. Escreva	a	classe	ConversaoDeUnidadesDeTempo	com	métodos	estáticos	
//		para	conversão	aproximada	das	unidades de	velocidade	segundo	a	lista	
//		abaixo.	
//		• 1	minuto	=	60	segundos
//		• 1	hora	=	60	minutos		
//		• 1	dia	=	24	horas		
//		• 1	semana	=	7	dias		
//		• 1	mês	=	30	dias		
//		• 1	ano	=	365.25	dias		
		
		
		System.out.println("Minuto para segundo: " + ConversaoDeUnidadesDeTempo.minutoSegundo(16));
		System.out.println("Hora para minuto: " + ConversaoDeUnidadesDeTempo.horaMinuto(3));
		System.out.println("Dia para hora: " + ConversaoDeUnidadesDeTempo.diaHora(3));
		System.out.println("Semana para dia: " + ConversaoDeUnidadesDeTempo.semanaDia(2));
		System.out.println("Mês para dia: " + ConversaoDeUnidadesDeTempo.mesDia(7));
		System.out.println("Ano para dia: " + ConversaoDeUnidadesDeTempo.anoDia(4));
		
	}

}
