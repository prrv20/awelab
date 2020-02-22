package ColeccionesDatos;
import java.util.Scanner;


public class Password {
	public Password() {
		int longitud = 8;
		String pass;
	}
	public static void esFuerte() {
		
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		//(Character.isLowerCase(car1))
	}
	public static void generarPassword() {
		
	}
	
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el Largo del Arreglo");
		int largo = entrada.nextInt();
		String passwords[] = new String[largo];
		
		
		for(int i = 0; i < passwords.length-1; i++) {
			System.out.println("Ingresa el Password ");
			String aux = entrada.next();
			passwords[i] = aux;
		}
	}
	public static void llenarArreglo() {
		for(int i = 0; i < passwords.length-1; i++) {
			System.out.println("Ingresa el Password ");
			String aux = entrada.next();
			passwords[i] = aux;
		}
	}

}
