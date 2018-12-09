package cursojava.basico.aula46.exercicios.exercicio03;

public class Exercicio03 {

	public static void main(String[] args) {

		Quadrado f1 = new Quadrado();
		f1.setNome("Quadrado");
		f1.setLado(2);
		
		Circulo f2 = new Circulo();
		f2.setNome("Círculo");
		f2.setRaio(2);
		
		Triangulo f3 = new Triangulo();
		f3.setNome("Triangulo");
		f3.setAltura(2);
		f3.setBase(3);
		
		Cubo f4 = new Cubo();
		f4.setNome("Cubo");
		f4.setLado(3);
		
		Cilindro f5 = new Cilindro();
		f5.setNome("Cilindro");
		f5.setAltura(3);
		f5.setRaio(2);
		
		Piramide f6 = new Piramide();
		f6.setNome("Pirâmide");
		f6.setAltura(3);
		f6.setApotema(4);
		f6.setArestaBase(2);
		f6.setNumPoliBase(4);
		f6.setBase(f1);
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		
		figuras[0] = f1;
		figuras[1] = f2;
		figuras[2] = f3;
		figuras[3] = f4;
		figuras[4] = f5;
		figuras[5] = f6;
		
		for(FiguraGeometrica figura : figuras) {
			System.out.println("#######################");
			System.out.println(figura.getNome());
			
			if(figura instanceof Figura2D) {
				Figura2D f2d = (Figura2D) figura;
				System.out.println(f2d.calcularArea());
			}
			if(figura instanceof Figura3D) {
				Figura3D f3d = (Figura3D) figura;
				System.out.println(f3d.calcularArea());
				System.out.println(f3d.calcularVolume());
			}
		}
	}
}