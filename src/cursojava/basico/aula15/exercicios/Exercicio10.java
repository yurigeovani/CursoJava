package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

//		10. Faça um Programa que pergunte em que turno você estuda. Peça
//		para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
//		mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
//		Inválido!", conforme o caso.

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o turno (M-matutino ou V-Vespertino ou N- Noturno): ");
		String turno = scan.nextLine();
		
		switch (turno) {
		case "M":
		case "m": System.out.println("Bom dia!"); break;
		case "V":
		case "v": System.out.println("Boa tarde!"); break;
		case "N":
		case "n": System.out.println("Boa noite!"); break;
		default: System.out.println("Valor inválido!");
		
		}
	}

}
