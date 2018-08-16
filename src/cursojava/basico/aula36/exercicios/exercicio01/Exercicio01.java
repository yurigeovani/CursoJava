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
		
		System.out.print("Informe o nome da agenda: ");
		Agenda.setNome(scan.next());
		
		
	}

}
