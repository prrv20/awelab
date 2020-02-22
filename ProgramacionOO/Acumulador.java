package ProgramacionOO;

public class Acumulador implements Actualizacion{
	private int valor;
	
	public Acumulador(int i) {
		this.valor = i;
	}
	public int daValor() {
		return this.valor;
	}
	
	public void incremeto(int a) {
		this.valor += a;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	@Override
	public void incremento(int a) {
		// TODO Auto-generated method stub
		this.valor += a;
	}
	
}
