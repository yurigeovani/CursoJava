package cursojava.basico.aula17.exercicios;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {

//		31. Um funcionário de uma empresa recebe aumento salarial anualmente:
//			Sabe-se que:
//			. Esse funcionário foi contratado em 1995, com salário inicial de
//			R$ 1.000,00;
//			a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
//			b. A partir de 1997 (inclusive), os aumentos salariais sempre
//			correspondem ao dobro do percentual do ano anterior. Faça um
//			programa que determine o salário atual desse funcionário. Após
//			concluir isto, altere o programa permitindo que o usuário digite o
//			salário inicial do funcionário.

		Scanner scan = new Scanner (System.in);
		
		System.out.print("Informe o salário do funcionário: R$ ");
		double salInicial = scan.nextDouble();
		
		int anoInicial = 1995;
		Calendar anoAtual = GregorianCalendar.getInstance();
		double aumento = 1.5;
		double salAtual = 0;
		
		for (int i = anoInicial+1; i<=anoAtual.get(Calendar.YEAR);i++) {
			salAtual += salInicial*aumento/100;
			System.out.println("Salário em " + i + ": R$ " + salAtual + ", Aumento de " + aumento + "%");
			aumento*=2;
		}
		
	}

}