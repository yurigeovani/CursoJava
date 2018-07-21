package cursojava.basico.aula27.exercicios.exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {

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
		
		lampada.ligar();
		lampada.mostrarEstado();
		
		lampada.desligar();
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		lampada.mostrarEstado();
	}

}
