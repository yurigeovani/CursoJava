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
		int indice = 0;
		Contato[] contatos = new Contato[3];
		int escolha=0;
		boolean sair = false;
		
		
		
		System.out.print("Informe o nome da agenda: ");
		agenda.setNome(scan.next());
		
		while(!sair) {
			agenda.mostrarOpcoes();
			System.out.print("Escolha a opção desejada: ");
			escolha = scan.nextInt();
			
			switch(escolha) {
			case 0:
				sair = true;
				break;
			case 1:
				if(indice<3) {
					Contato contato = new Contato();
					
					System.out.print("Nome: ");
					String nome = scan.next();
					contato.setNome(nome);
					System.out.print("Telefone: ");
					contato.setTelefone(scan.next());
					System.out.print("E-mail: ");
					contato.setEmail(scan.next());
					contatos[indice]=contato;
					agenda.setContatos(contatos);
					indice++;
				} else {
					System.out.println("Agenda lotada!");
				}
				break;
			case 2:
				System.out.print("Informe o nome:");
				agenda.consultarContato(scan.next());
				break;
			case 3:
				agenda.listarTodosContatos();
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}
	}
}