package InterfacesClasesAbstractas;

public class Cuadrado extends Figura{
	double lado ;
	
	//Metodo Constructor
	public Cuadrado(double x, double y, double lado) {
		super(x,y);
		this.lado = lado;
	}
	//Sobreescribimos el Metodo Abstracto area de la Clase Figura 
	@Override
	public double area() {
		
		return (lado * lado);
	}
}
