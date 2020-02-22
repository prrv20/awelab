package IniciandoJava;
import java.util.Scanner;

public class MayorEdad {
	static int edad = 0;
	String nombre = "";
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] Args) {
		
		System.out.println("Ingresa tu Nombre");
		String nombre = entrada.nextLine ();
		System.out.println("Ingresa tu Edad");
		edad = entrada.nextInt();
		
		if (edad >= 18) {
			System.out.println("Hola " + nombre + " Eres Mayor de Edad");
		}else{
			System.out.println("Hola " + nombre + " Eres Menor de Edad");
		}
	}
	

}
