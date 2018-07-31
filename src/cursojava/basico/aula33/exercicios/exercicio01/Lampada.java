package cursojava.basico.aula33.exercicios.exercicio01;

public class Lampada {
	
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
//	private String[] tipos;
	private boolean tipoAbajur;
	private boolean ligada;

//	public String[] getTipos() {
//		return tipos;
//	}
//	public void setTipos(String[] tipos) {
//		this.tipos = tipos;
//	}	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipoLuz() {
		return tipoLuz;
	}
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	public int getGarantiaMeses() {
		return garantiaMeses;
	}
	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	public boolean isTipoAbajur() {
		return tipoAbajur;
	}
	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	
	
	public Lampada() {
	}
	
	public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses,
			boolean tipoAbajur, boolean ligada/*, String[] tipos*/) {
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.garantiaMeses = garantiaMeses;
//        this.tipos = tipos;
		this.tipoAbajur = tipoAbajur;
		this.ligada = ligada;
	}
	
	
	public void ligar() {
		this.setLigada(true);
	}
	
	public void desligar() {
		this.setLigada(false);
	}
	
	public void mudarEstado() {
		if(this.isLigada()==false) {
			this.setLigada(true);
		} else {
			this.setLigada(false);
		}
	}
	
	public void status() {
		System.out.println(getModelo());
		System.out.println(getTensao());
		System.out.println(getPotencia());
		System.out.println(getCor());
		System.out.println(getTipoLuz());
		System.out.println(getGarantiaMeses());
//		System.out.println(getTipoLuz());
		System.out.println(isLigada());
	}
	
}