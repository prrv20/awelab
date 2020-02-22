package InterfacesClasesAbstractas;

public class Circulo extends Figura{
	
	double radio;
	//Metodo Constructor
		public Circulo(double x, double y, double radio) {
			super(x,y);
			this.radio = radio;
		}
		//Sobreescribimos el Metodo Abstracto area de la Clase Figura 
		@Override
		public double area() {
			return Math.PI * radio * radio;
		}
}
