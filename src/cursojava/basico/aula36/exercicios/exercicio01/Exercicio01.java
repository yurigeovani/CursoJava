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
		Contato contatos = new Contato();
//		String cadastrar = "";
		int escolha=0;
		int idContato = 0;
		boolean sair = false;
		
		
		
		System.out.print("Informe o nome da agenda: ");
		agenda.setNome(scan.next());
		
		while(!sair) {
			agenda.mostrarOpcoes();
			System.out.print("Escolha a opção desejada: ");
			escolha = scan.nextInt();

			switch(escolha) {
			case 1:
				String nome="", email="", telefone="";
				System.out.print("Nome: ");
				nome = scan.next();
				System.out.print("Telefone: ");
				email = scan.next();
				System.out.print("E-mail: ");
				telefone = scan.next();
				idContato++;
				break;
			case 2:
				System.out.print("Informe o nome:");
				agenda.consultarContato(scan.next());
				break;
			case 3:
				agenda.listarTodosContatos();
			default:
				sair = true;
			}
		}
	}
}