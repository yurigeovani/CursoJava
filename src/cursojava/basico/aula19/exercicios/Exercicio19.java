package cursojava.basico.aula19.exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

//		19. Ler as duas notas bimestrais para um conjunto de 10 alunos.
//		Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
//		tipo real. Escreva um programa que calcule a média aritmética simples
//		das notas informadas armazenando o resultado em um vetor “Result”
//		de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação	
//		de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
//		estará “aprovado”, caso contrário, a situação do aluno será
//		“reprovado”.
		
		Scanner scan = new Scanner(System.in);
		
		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] result = new double[10];
		
		for(int i=0; i<nota1.length;i++) {
			System.out.println("Para o aluno " + i + ", informe as notas:");
			System.out.print("Nota 1: ");
			nota1[i]=scan.nextDouble();
			System.out.print("Nota 2: ");
			nota2[i]=scan.nextDouble();
		}
		for(int i=0; i<nota1.length;i++) {
			result[i]=(nota1[i]+nota2[i])/2;
			if(result[i]>=7) {
				System.out.println("O Aluno " + i + " está APROVADO: " + result[i]);
			} else {
				System.out.println("O Aluno " + i + " está REPROVADO: " + result[i]);
			}
		}
	}

}
