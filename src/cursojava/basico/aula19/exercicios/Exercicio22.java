package cursojava.basico.aula19.exercicios;

public class Exercicio22 {

	public static void main(String[] args) {

//		22. Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
//		0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
//		para implementar um programa que determine o percentual de
//		números 0's e 1's existentes no vetor A.
		
		int[] vetor = new int[10];
		int countZero = 0;
		int countUm = 0;
		double percentZero;
		double percentUm;
		
		System.out.println("Números aleatórios: ");
		for(int i=0; i<vetor.length; i++) {
			vetor[i] = (int) Math.round(Math.random());
			System.out.println(vetor[i]);
		}
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i]==0) {
				countZero++;
			}
		}
		
		countUm = vetor.length-countZero;
		percentZero = 100*countZero/vetor.length;
		percentUm = 100-percentZero;
		
		System.out.println("Percentual 0: " + percentZero);
		System.out.println("Percentual 1: " + percentUm);
	}

}
