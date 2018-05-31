package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

//		4. Faça um Programa que verifique se uma letra digitada é vogal ou
//		consoante.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a letra: ");
		String letra = scan.nextLine();
		
		switch (letra) {
		case "a": 
		case "A": 
		case "e": 
		case "E": 
		case "i": 
		case "I": 
		case "o": 
		case "O": 
		case "u": 
		case "U": System.out.println("Vogal!"); break;
		default: System.out.println("É consoante");
			break;
		}
	}

}
