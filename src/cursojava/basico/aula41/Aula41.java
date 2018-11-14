package cursojava.basico.aula41;

public class Aula41 {

	public static void main(String[] args) {


//		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
	
//		pessoa.setEndereco("Rua Pessoa");
		aluno.setEndereco("Rua Aluno");
		professor.setEndereco("Rua Professor");
		
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
		

		aluno.imprimirEtiquetaEdereco();
		professor.imprimirEtiquetaEdereco();
	}

}
