package ColeccionesDatos;
import java.util.Scanner;

public class ArregloSencillo {
	static int n;
	static int numero;
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] Args) {
		System.out.println("De cuantos Indices el Arreglo: ");
		n = entrada.nextInt();
		int numeros[];
		numeros = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Ingresa el Numero "+(i+1));
			numero = entrada.nextInt();
			numeros[i]= numero;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(" Numero "+numeros[i]);
		}
	}
}
