package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

//		2. Faça um programa que leia um nome de usuário e a sua senha e não
//		aceite a senha igual ao nome do usuário, mostrando uma mensagem
//		de erro e voltando a pedir as informações.

		Scanner scan = new Scanner(System.in);
		
		String user;
		String pass;
		boolean validaSenha = false;
		
		while (!validaSenha) {
			System.out.print("Informe o usuário: ");
			user = scan.next();
			System.out.print("Informe a senha: ");
			pass = scan.next();
			
			if (user.equals(pass)) {
				System.out.println("Acesso negado! Nome de usuário igual à senha.");
			} else {
				validaSenha = true;
				System.out.println("Acesso concedido!");
			}
		}
	}

}
