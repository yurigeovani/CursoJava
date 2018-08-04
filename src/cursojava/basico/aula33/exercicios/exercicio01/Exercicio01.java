package cursojava.basico.aula33.exercicios.exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {

//		Reescreva	os	seguintes	exercícios,	criando	todos	os	atributos	do	tipo	privado,	
//		métodos	getters	e	setters	e	construtores.	Os	métodos	que	serão	utilizados	pela	
//		classe	de	teste	devem	ser	públicos.	Se	necessário,	crie	métodos	privados	como	
//		auxiliares	para	organizar	melhor	o	código	fonte	também.
//		
//		1. Escreva	uma classe para	representar	uma	lâmpada. Desenvolva	métodos	
//		para	ligar,	desligar	a	lampada.
		
		Lampada lampada = new Lampada("Fluorescente", "110V", 7, "branca", "LED", 12, false, true);

		lampada.status();
	}

}
