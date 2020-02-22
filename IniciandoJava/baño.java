package IniciandoJava;
import java.util.Scanner;

public class baño {
	static String nombre;
	static String genero;
	static Scanner entrada = new Scanner (System.in);
	
	public static void main(String[] Args) {
		System.out.println("Ingresa tu Nombre");
		nombre = entrada.nextLine();
		System.out.println("Hombre o Mujer");
		genero = entrada.nextLine();
		
		if(genero.equalsIgnoreCase("hombre") ) {
			System.out.println(nombre + " Usa el Baño de Caballeros");
		}else {
			System.out.println(nombre + " Usa el Baño de Damas");
		}
	}
}
