package cursojava.basico.aula24.exercicios.exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {

//		1. Escreva uma classe para representar uma lâmpada que está à venda em um supermercado.	

		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		lampada.tipoAbajur = true;
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeões";
		
		System.out.println("Modelo: " + lampada.modelo);
		System.out.println("Cor: " + lampada.cor);
				
	}

}