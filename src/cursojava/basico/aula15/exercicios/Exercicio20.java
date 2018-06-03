package cursojava.basico.aula15.exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

//		20. Faça um programa que faça 5 perguntas para uma pessoa sobre um
//		crime. As perguntas são:
//		a "Telefonou para a vítima?"
//		b. "Esteve no local do crime?"
//		c. "Mora perto da vítima?"
//		d. "Devia para a vítima?"
//		e. "Já trabalhou com a vítima?" 
//		O programa deve no final emitir uma classificação sobre a participação 
//		da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser
//		classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
//		como "Assassino". Caso contrário, ele será classificado como
//		"Inocente".
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Responda as perguntas com S para SIM e N para NÃO!");
		System.out.print("a) Telefonou para a vítima?");
		String a = scan.next();
		System.out.print("b) Esteve no local do crime?");
		String b = scan.next();
		System.out.print("c) Mora perto da vítima?");
		String c = scan.next();
		System.out.print("d) Devia para a vítima?");
		String d = scan.next();
		System.out.print("e) Já trabalhou com a vítima?");
		String e = scan.next();
		
		int cont = 0;
		
		if (a=="S" || a=="s") {
			cont++;
		} 
		if (b=="S" || b=="s") {
			cont++;
		} 
		if (c=="S" || c=="s") {
			cont++;
		}
		if (d=="S" || d=="s") {
			cont++;
		} 
		if (e=="S" || e=="s") {
			cont++;
		} 
		
		System.out.println("cont " + cont);
		
		switch (cont) {
		case 2: System.out.println("Suspeita!"); break;
		case 3:
		case 4: System.out.println("Cúmplice!"); break;
		case 5: System.out.println("Assassina!"); break;
		default: System.out.println("Inocente!");
		}
	}

}
