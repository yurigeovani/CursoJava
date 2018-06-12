package cursojava.basico.aula17.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

//		3. Faça um programa que leia e valide as seguintes informações:
//			a. Nome: maior que 3 caracteres;
//			b. Idade: entre 0 e 150;
//			c. Salário: maior que zero;
//			d. Sexo: 'f' ou 'm';
//			e. Estado Civil: 's', 'c', 'v', 'd';

		Scanner scan = new Scanner(System.in);

		String nome = "";
		int idade = 0;
		double salario = 0;
		String sexo = "";
		String estadoCivil = "";
		
		boolean validacao = false;
//		boolean validaIdade = false;
//		boolean validaSalario = false;
//		boolean validaSexo = false;
//		boolean validaEstado = false;
		
		while (!validacao) {
			System.out.print("Informe um nome: ");
			nome = scan.next();
			
			if (nome.length()<=3) {
				System.out.println("Informe um nome com mais de 3 caracteres!");
			} else {
				validacao = true;
			}
		}
		
		validacao = false;
		while (!validacao) {
			System.out.print("Informe a idade: ");
			idade = scan.nextInt();
			
			if (idade<0 || idade>150) {
				System.out.println("Informe uma idade válida: ");
			} else {
				validacao = true;
			}
		}
		
		validacao = false;
		while(!validacao) {
			System.out.print("Informe o salário: ");
			salario = scan.nextDouble();
			
			if (salario<=0) {
				System.out.println("Informe um salário válido!");
			} else {
				validacao = true;
			}
		}
		
		validacao = false;
		while(!validacao) {
			System.out.print("Informe o sexo: ");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				validacao = true;
			} else {
				System.out.println("Informe um sexo válido!");
			}
		}
		
		validacao = false;
		while(!validacao) {
			System.out.print("Informe o estado civil: ");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("d") || estadoCivil.equalsIgnoreCase("v")) {
				validacao = true;
			} else {
				System.out.println("Informe um estado civil válido!");
			}
		}
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: R$ " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
	}

}
