package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {

//		30. Desenvolva um programa que faça a tabuada de um número qualquer
//		inteiro que será digitado pelo usuário, mas a tabuada não deve
//		necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
//		devem ser informados também pelo usuário, conforme exemplo
//		abaixo:
//		Montar a tabuada de: 5
//		Começar por: 4
//		Terminar em: 7
//		Vou montar a tabuada de 5 começando em 4 e terminando em 7:
//		5 X 4 = 20
//		5 X 5 = 25
//		5 X 6 = 30
//		5 X 7 = 35
//		Obs: Você deve verificar se o usuário não digitou o final menor
//		que o inicial.
		
		
		Scanner scan = new Scanner(System.in);
				
		System.out.print("Informe o número da tabuada: ");
		int num = scan.nextInt();
		
		System.out.print("Informe a operação (+, -, *, /): ");
		String operador = scan.next();
		
		System.out.print("Começar em: ");
		int numInicial = scan.nextInt();
		
		System.out.print("Terminar em: ");
		int numFinal = scan.nextInt();
		
		int resultado = 0;
		
		if (numInicial<numFinal) {
			switch(operador) {
			case "+":
					for (int i = numInicial; i <=numFinal; i++) {
						resultado = num+i;
						System.out.println(num + " + " + i + " = " + resultado);
					}
				break;
			case "-":
					for (int i = numInicial+num; i <=numFinal+num; i++) {
						resultado = i-num;
						System.out.println(i + " - " + num + " = " + resultado);
					}
				break;
			case "*":
					for (int i = numInicial; i <=numFinal; i++) {
						resultado = num*i;
						System.out.println(num + " * " + i + " = " + resultado);
					}
				break;
			case "/":
					for (int i = numInicial*num; i <=numFinal*num; i++) {
						if (i%num==0) {
							resultado = i/num;
							System.out.println(i + " / " + num + " = " + resultado);
						}
					}
				break;
		}
		} else {
			System.out.println("Número final menor ou igual ao inicial! Repita a operação!");
		}
	}
}