package cursojava.basico.aula19.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

//		20. Implementar um programa que obtenha a cotação do dólar (U$) em
//		relação ao real (R$) e a seguir armazene em vetor A com 20
//		elementos as seguintes conversões:
//		A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		double[] valor = new double[20];
		double cotacao;
		
		System.out.print("Informe o valor da cotação: R$ ");
		cotacao = scan.nextDouble();
		
		for(int i=0; i<valor.length; i++) {
			valor[i]=cotacao*(i+1);
		}
		
		for(int i=0; i<valor.length;i++) {
			System.out.println("Valor da posição " + i + " da cotação: R$ " + df.format(valor [i]));
		}
		
	}

}
