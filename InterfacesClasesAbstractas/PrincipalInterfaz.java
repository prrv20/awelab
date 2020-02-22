package InterfacesClasesAbstractas;

import java.util.Scanner;

public class PrincipalInterfaz {

	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		double rad = 0;
		double lad = 0;
		
		System.out.println("Ingrese el Radio del Circulo ");
		rad = entrada.nextDouble();
		Circulo circulo = new Circulo(0, 0, rad);
		System.out.println("El Area del Circulo es " + circulo.area());
		
		System.out.println("Ingrese el Area del Cuadrado ");
		lad = entrada.nextDouble();
		Cuadrado cuadrado = new Cuadrado(0, 0, lad);
		System.out.println("El Area del Cuadrado es "+ cuadrado.area());

		//Figura figura = new Figura(6, 8);
	}

}
