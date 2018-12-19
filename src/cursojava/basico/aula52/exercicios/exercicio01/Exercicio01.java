package cursojava.basico.aula52.exercicios.exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

//		30  MINUTOS DO V�DEO https://www.youtube.com/watch?time_continue=1&v=tc48uwR9Qto
//		Escreva	uma	classe Contato que	contenha	nome,	telefone	e	um	
//		identificador. Esse	identificador	deve	ser	gerado	automaticamente	pela	
//		classe	através	de	um	contador	(cada	vez	que	um	Contato	é	criado	o	
//		contador	é	incrementado	e	atribuído	ao	identificador).	Crie	uma	classe	
//		Agenda	que	irá	funcionar	para	gerenciar	os	Contatos.	Essa	classe	precisa	
//		de	ter	um	método	para	adicionar	um	Contato	e	também	para	consultar.
//		Crie	uma	classe	Teste	que	informe	um	menu	ao	usuário:	1- para	consultar	
//		um	contato	da	agenda	e	2	– para	adicionar	um	contato	na	agenda.
//		
//		Se	o	contato	não	existir,	o	programa	deve	lançar	uma	exceção	de	
//		ContatoNaoExisteException.	Caso	a	agenda	esteja	cheia	quando	o	usuário	
//		quiser	adicionar	um	novo	contato,	o	programa	deve	lançar	uma	exceção	
//		AgendaCheiaExeption.	Trate	também	as	exceções	de	tipo	de	dados	(caso	o	
//		usuário	entre	com	um	tipo	de	dado	invalido.

		Scanner scan = new Scanner(System.in);
		
		int opcao = obterOpcaoMenu(scan);
		
		if(opcao == 1) { //Consultar Contato
			
		} else if(opcao == 2) { //Adicionar Contato
			
		} else if (opcao ==3) { //Sair
			System.exit(0);
		}
	}

	public static int obterOpcaoMenu(Scanner scan) {
		
		boolean entradaValida = false;
		int opcao = 3;
		
		while (!entradaValida) {
			System.out.println("######### OPÇÕES #########");
			System.out.println("1) Consultar contato;");
			System.out.println("2) Adicionar contato;");
			System.out.println("3) Sair.");
			System.out.print("Informe a opção desejada: ");
			
			try {
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				
				if(opcao == 1 || opcao == 2 || opcao == 3) {
					entradaValida = true;
				} else {
					throw new Exception("Entrada inv�lida! Digite novamente!");
				}
			}
			
			catch(Exception e) {
				System.out.println("Entrada inválida! Digite novamente!\n");
			}
		}
	
		return opcao;
	}
}