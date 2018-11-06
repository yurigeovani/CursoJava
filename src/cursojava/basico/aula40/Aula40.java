package cursojava.basico.aula40;

public class Aula40 {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
	
		pessoa.setEndereco("Rua Pessoa");
		aluno.setEndereco("Rua Aluno");
		professor.setEndereco("Rua Professor");
	
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
	}
}
