package ColeccionesDatos;
import java.util.Scanner;

public class Ejercicio4 {

	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		
		do {
			System.out.println("Ingrese un Numero");
			numero = entrada.nextInt();
		}while(numero < 0);
		
		System.out.println("El Numero es " + numero);
	}

}
