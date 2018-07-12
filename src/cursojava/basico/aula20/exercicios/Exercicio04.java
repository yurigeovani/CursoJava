package cursojava.basico.aula20.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

//		4. Faça um programa para armazenar em uma matriz os
//		compromissos de uma agenda pessoal. Cada dia do mês deve
//		conter 24 horas, onde para cada uma destas 24 horas podemos
//		associar um tarefa específica (compromisso agendado). O
//		programa deve ter um menu onde o usuário indica o dia do mês
//		que deseja alterar e a hora, entrando em seguida com o
//		compromisso, ou então, o usuário pode também consultar a
//		agenda, fornecendo o dia e a hora para obter o
//		compromisso armazenado.
		
		
		Scanner scan = new Scanner(System.in);
		
		String[][] compromisso = new String[31][24];
		int dia = 0;
		int hora = 0;
		String escolha;
		byte menu;
		boolean validador = true;
		
		while(validador) {		
			System.out.println("1) Incluir compromisso;");
			System.out.println("2) Consultar compromisso;");
			System.out.println("3) Sair;");
			System.out.print("Informe a opção desejada: ");
			menu = scan.nextByte();
			
			if(menu==1) {
				while(validador) {
					System.out.print("Informe o dia do mês: ");
					dia = scan.nextInt();
					for(int i=dia-1; i<compromisso.length; i++) {
						System.out.print("Informe a hora: ");
						hora = scan.nextInt();
						for(int j=hora-1; j<compromisso[i].length; j++) {
							System.out.print("Informe o compromisso: ");
							compromisso[dia-1][hora-1] = scan.next();
							break;
						}
						break;
					}
					System.out.print("Deseja incluir mais algum compromisso (S/N): ");
					escolha = scan.next();
					if(escolha.equalsIgnoreCase("n")) {
						validador=false;
					}
				}
			}
			
			validador = true;
			if(menu==2) {
				while(validador) {
					System.out.print("Informe o dia do mês: ");
					dia = scan.nextInt();
					for(int i=dia-1; i<compromisso.length; i++) {
						System.out.print("Informe a hora: ");
						hora = scan.nextInt();
						for(int j=hora-1; j<compromisso[i].length; j++) {
							System.out.println("Compromisso: " + compromisso[dia-1][hora-1]);
							break;
						}
						break;
					}
					System.out.print("Deseja consultar mais algum compromisso (S/N): ");
					escolha = scan.next();
					if(escolha.equalsIgnoreCase("n")) {
						validador=false;
					}
				}

			}
			
			validador = true;
			if(menu==3) {
				validador = false;
			}

		}

	}

}
