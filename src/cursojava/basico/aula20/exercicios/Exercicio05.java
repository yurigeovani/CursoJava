package cursojava.basico.aula20.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

//		5. Modifique o programa anterior de maneira a guardar os
//		compromissos de todo o ano, organizados por mês, dia e hora
//		(só 8 horas por dia).
		
		Scanner scan = new Scanner(System.in);
		
		String[][][] compromisso = new String[12][31][8];
		byte mes = 0;
		byte dia = 0;
		byte hora = 0;
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
					System.out.print("Informe o mês: ");
					mes = scan.nextByte();
					for(int i=mes-1; i<compromisso.length; i++) {
						System.out.print("Informe o dia do mês: ");
						dia = scan.nextByte();
						for(int j=dia-1; j<compromisso[i].length; j++) {
							System.out.print("Informe a hora (8-15): ");
							hora = scan.nextByte();
							for(int k=hora-8; k<compromisso[i][j].length; k++) {
								System.out.print("Informe o compromisso: ");
								compromisso[mes-1][dia-1][hora-8] = scan.next();
								break;
							}
							break;
						}
						break;
					}
					System.out.print("Deseja incluir mais algum compromisso (S/N): ");
					escolha = scan.next();
					if(escolha.equalsIgnoreCase("n")) {
						validador=false;
					} else {
						validador=true;
					}
				}
			}
			
			validador = true;
			if(menu==2) {
				while(validador) {
					System.out.print("Informe o mês: ");
					mes = scan.nextByte();
					for(int i=mes-1; i<compromisso.length; i++) {
						System.out.print("Informe o dia do mês: ");
						dia = scan.nextByte();
						for(int j=dia-1; j<compromisso[i].length; j++) {
							System.out.print("Informe a hora (8-15): ");
							hora = scan.nextByte();
							for(int k=hora-8; k<compromisso[i][j].length; k++) {
								System.out.println("Compromisso: " + compromisso[mes-1][dia-1][hora-8]);
								break;
							}
							break;
						}
						break;
					}
					System.out.print("Deseja consultar mais algum compromisso (S/N): ");
					escolha = scan.next();
					if(escolha.equalsIgnoreCase("n")) {
						validador=false;
					} else {
						validador=true;
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
