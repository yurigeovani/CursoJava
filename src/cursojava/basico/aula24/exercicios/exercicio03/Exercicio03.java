package cursojava.basico.aula24.exercicios.exercicio03;

public class Exercicio03 {

	public static void main(String[] args) {

//		3. Usando o resultado do exercício anterior como base, crie uma classe “LivroDeLivraria” que represente 
//		os dados básicos de um livro que está à venda em uma livraria.
		
		LivroDeLivraria livro = new LivroDeLivraria();
		livro.titulo = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		livro.preco = 63.39;
		
		System.out.println("Nome do livro = " + livro.titulo);
	}

}
