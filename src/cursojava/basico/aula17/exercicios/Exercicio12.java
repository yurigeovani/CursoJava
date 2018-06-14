package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

//		12. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
//		qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
//		numero ele deseja ver a tabuada. A saída deve ser conforme o
//		exemplo abaixo:
//		Tabuada de 5:
//		5 X 1 = 5
//		5 X 2 = 10
//		...
//		5 X 10 = 50
		
		
		Scanner scan = new Scanner (System.in);
		
		int num = 0;
		String operador = "";
		boolean validador = false;
		
		while(!validador) {
			
			System.out.print("Informe o primeiro número desejado [1-10]: ");
			num = scan.nextInt();
			
			if(num>=1 && num<=10) {
				validador = true;
			} else {
				System.out.println("Número inválido! Informe um número de 1 a 10!");
			}
		}
		
//		validador=false;
//		while(!validador) {
//			
//			System.out.print("Informe o segundo número desejado [1-10]: ");
//			num2 = scan.nextInt();
//			
//			if(num2>=1 && num2<=10) {
//				validador = true;
//			} else {
//				System.out.println("Número inválido! Informe um número de 1 a 10!");
//			}
//		}
		
		
		validador=false;
		while(!validador) {
			
			System.out.print("Informe o operador desejado: ");
			operador = scan.next();

			switch(operador) {
			case "+":
				for (int i = 1; i<=10; i++) {
					System.out.println(num + " + " + i + " = " + (num+i));
				}
				validador = true;
				break;
			case "-":
				for (int i = num+1; i<=num+10; i++) {
					System.out.println(i + " - " + num + " = " + (i-num));
				}
				validador = true;
				break;
			case "*":
				for (int i = 1; i<=10; i++) {
					System.out.println(num + " * " + i + " = " + (num*i));
				}
				validador = true;
				break;
			case "/":
				for (int i = num; i<=num*10; i++) {
					System.out.println(i + " / " + num + " = " + (i/num));
					i--;
					i+=num;
				}
				validador = true;
				break;
			default: 
				System.out.println("Informe um operador válido!"); 
				validador = false;
			}
		}
		
	}

}
