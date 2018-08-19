package cursojava.basico.aula36.exercicios.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

//		1. Escreva	uma	classe	Agenda,	que	contém	vários	contatos	do	tipo	Contato.	
//		Cada	contato	possui	nome,	telefone	e	email. A	Agenda	também	possui	um	
//		nome.	Crie	um	programa	teste	que	peça	para	o	usuário	entrar	com	o	
//		nome	da	Agenda	e	em	seguida	3	contatos.	Crie	métodos	que	retornem	
//		uma	String	com	a	informação	de	cada	contato	e	também	de	todos	os	
//		contatos	da	agenda.
		
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		Contato[] contatos = new Contato[3];
		
		
		
		System.out.print("Informe o nome da agenda: ");
		agenda.setNome(scan.next());

		for(int i = 0; i<3; i++) {
			System.out.print("Informe o nome do contato " + i + ": ");
//			contatos.setNome(scan.next());
			System.out.println("Informe o telefone do contato " + i + ": ");
			contatos[i].setTelefone(scan.next());
			System.out.println("Informe o e-mail do contato " + i + ": ");
			contatos[i].setEmail(scan.next());
		}
	}
}