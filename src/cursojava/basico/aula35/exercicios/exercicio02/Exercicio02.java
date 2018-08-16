package cursojava.basico.aula35.exercicios.exercicio02;

public class Exercicio02 {

	public static void main(String[] args) {

//		2. Escreva	um	método recursivo e	estático	que	receba	um	número	inteiro	
//		positivo	N	e	calcule	o	somatório	dos	números	de	1	a N
		
		System.out.println(Calculadora.calcular(10));
		
		for(int i=0;i<=10;i++) {
			System.out.print("Posição " + i + " ");
			System.out.println(Calculadora.calcular(i) + " ");
		}
	}

}
