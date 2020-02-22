package InterfacesClasesAbstractas;

public abstract class Figura {
	private double x;
	private double y;
	
	//Constructor de la Clase Figura
	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}
	// metodo Abstracto(No se Implementa)
	public abstract double area();
}
