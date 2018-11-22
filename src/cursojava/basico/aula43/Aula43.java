package cursojava.basico.aula43;

public class Aula43 {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da computação!");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "asdf1234";
		String s2 = "asdf1234";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("Música");
		double[] notas2 = {8, 9, 10, 10};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
		
	}
}
