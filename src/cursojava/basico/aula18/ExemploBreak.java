package cursojava.basico.aula18;

import java.util.Scanner;

public class ExemploBreak {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int num = scan.nextInt();
		System.out.println("Entre com um limite: ");
		int max = scan.nextInt();
		
		for (int i = num; i<=max;i++) {
			System.out.println(i);
			if(i%7==0) {
				System.out.print("O valor de i é: " + i);
				break;
			}
		}
	}

}
