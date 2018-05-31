package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

//		3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//		Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o sexo (M/F):");
		String sexo = scan.nextLine();
		
		switch (sexo) {
		case "m":
		case "M": System.out.println("Sexo Masculino!"); break;
		case "f":
		case "F": System.out.println("Sexo Feminino!"); break;
		default: System.out.println("Sexo Inválido!");
		}
	}

}
