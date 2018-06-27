package cursojava.basico.aula18;

import java.util.Scanner;

public class ExemploGoTo {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("Informe um número: ");
//		int num = scan.nextInt();
		
		for (int i=0; i<=4; i++) {
				rotulo1:{
					rotulo2:{
						rotulo3:{
							if(i==1) {
								break rotulo1;
							}
							if(i==2) {
								break rotulo2;
							}
							if(i==3) {
								break rotulo3;
							}
							System.out.println("Rótulo3");
					}
					System.out.println("Rótulo2");
				}
				System.out.println("Rótulo1");
			}
			System.out.println(i);
		}
		
	}

}
