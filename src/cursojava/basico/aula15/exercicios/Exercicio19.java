package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

//		19. Faça um Programa que leia 2 números e em seguida pergunte ao
//		usuário qual operação ele deseja realizar. O resultado da operação
//		deve ser acompanhado de uma frase que diga se o número é:
//		a. par ou ímpar;
//		b. positivo ou negativo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		double num1 = scan.nextDouble();
		System.out.print("Informe o segundo número: ");
		double num2 = scan.nextDouble();
		System.out.print("Informe a operação a ser utilizada: ");
		String operacao = scan.next();
		
		double resultado =0;
	
		switch (operacao) {
		case "+":resultado=num1+num2; break;
		case "-":resultado=num1-num2; break;
		case "*":resultado=num1*num2; break;
		case "/":resultado=num1/num2; break;
		default: System.out.println("Informe uma operação válida!");
		}
		
		if (resultado%2==0) {
			System.out.println("O número é PAR: " + resultado);
		} else {
			System.out.println("O número é ÍMPAR: " + resultado);
		}
		
		if (resultado>0) {
			System.out.println("O número é POSITIVO: " + resultado);
		} else if (resultado<0) {
			System.out.println("O número é NEGATIVO: " + resultado);
		} else {
			System.out.println("O número é: " + resultado);
		}
	}

}
