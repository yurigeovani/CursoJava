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
		String escolha;
		int contador = 0;
		boolean sair = false;
		Agenda agenda = new Agenda();
		Contato[] contatos = new Contato[3];

		System.out.print("Informe o nome da agenda: ");
		agenda.setNome(scan.next());
		

		while(!sair) {
			System.out.println("################## AGENDA " + agenda.getNome().toUpperCase() + " ##################");
			
			Contato contato = new Contato();
			agenda.setContatos(contatos);
			
			agenda.mostrarOpcoes();
			escolha = scan.next();
			System.out.println("##################################################");
			switch (escolha) {
			case "1":
				if(contador<3) {
					System.out.println("################# DADOS CONTATO #################");
					System.out.print("Nome: ");
					contato.setNome(scan.next());
					System.out.print("Fone: ");
					contato.setFone(scan.next());
					System.out.print("Email: ");
					contato.setEmail(scan.next());
					contatos[contador]=contato;
					contador++;
				} else {
					System.out.println("Agenda lotada!");
				}
				break;
			case "2":
				System.out.print("Informe o nome: ");
				agenda.consultarContato(scan.next());
				break;
			case "3":
				agenda.listarContatos();
				break;
			case "0":
				sair=true;
				break;
			default:
				System.out.println("Informe uma op��o v�lida!");
				break;
			}
		}
	}
}