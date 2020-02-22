package ColeccionesDatos;

import java.util.Scanner;

public class Ejercicio1 {
	
	static Scanner entrada = new Scanner (System.in);
	int numero;
	int numeros[]  = new int[14];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio1 ej = new Ejercicio1();
		ej.llenar();
		System.out.println("**********************");
		ej.mostrar();
		
		
	}
	public void llenar() {
		for (int i = 0; i < 14; i++) {
			System.out.println("Ingresa el Numero "+(i+1));
			numero = entrada.nextInt();
			numeros[i]= numero;
		}
	}
	public void mostrar() {
		for (int i = 0; i < 14; i++) {
			System.out.println(" Numeros ["+ i +  "] " +numeros[i]);
		}
	}
}
