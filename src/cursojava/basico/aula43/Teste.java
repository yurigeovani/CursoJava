package cursojava.basico.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da computação");
		
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "asdfasdf";
		String s2 = "asdfasdf";
		
		System.out.println(s1.equals(s2));
		
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("Ciência da computação");
		double[] notas2 = {6, 7, 8, 7};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
		
	}
}