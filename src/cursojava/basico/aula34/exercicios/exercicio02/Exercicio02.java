package cursojava.basico.aula34.exercicios.exercicio02;

public class Exercicio02 {

	static void imprimir(double num) {
		System.out.println(Calculadora.getResultado());
	}
	
	public static void main(String[] args) {

//		2. Escreva	uma	classe	Calculadora	que	tenha	os seguintes	métodos:	somar,	
//		subtrair,	multiplicar,	dividir (dois	números),	elevar	à	potência	n.	
//		Desenvolva	um	programa	para	testar	essa	classe.
		
		imprimir(Calculadora.somar(10, 20));
		
		imprimir(Calculadora.subtrair(2, 1));
		
		imprimir(Calculadora.multiplicar(2, 2));
		
		imprimir(Calculadora.dividir(4, 2));
		
		imprimir(Calculadora.elevar(2, 4));
	}

}