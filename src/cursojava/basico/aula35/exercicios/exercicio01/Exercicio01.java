package cursojava.basico.aula35.exercicios.exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {

//		1. Escreva	um	método recursivo e	estático	que	calcule	e	retorne	o	N-ésimo	
//		termo	da	sequência	Fibonacci.	Alguns	números	desta	sequência	são:	0,	1,	
//		1,	2,	3,	5,	8,	13,	21,	34,	55,	89...
		
		
		System.out.println(Fibonacci.calcularFibonacci(5));
		
		for(int i=1; i<10; i++) {
			System.out.print(Fibonacci.calcularFibonacci(i) + " ");
		}
	}

}
