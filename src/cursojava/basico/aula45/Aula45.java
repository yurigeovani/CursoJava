package cursojava.basico.aula45;

public class Aula45 {

	public static void main(String[] args) {

//		Aluno aluno = new Aluno();
//		Pessoa pessoaAluno = aluno;  //upcasting
//		
//		Pessoa aluno2 = (Pessoa) new Aluno();
//		
//		Pessoa aluno3 = new Pessoa();
//		
//		Aluno aluno4 = (Aluno) aluno3;
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor prof = new Professor();
		
		if (pessoa instanceof Pessoa) {
			System.out.println("� do tipo Pessoa");
		}
		if (aluno instanceof Aluno) {
			System.out.println("� do tipo Aluno");
		}
		if (prof instanceof Professor) {
			System.out.println("� do tipo Professor");
		}
	}
}