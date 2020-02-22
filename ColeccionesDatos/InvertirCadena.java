package ColeccionesDatos;
import java.util.Scanner;

public class InvertirCadena {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String cadenaOriginal;
		String cadenaInvertida = "";
		 
		System.out.println("Ingrese una Frase ");
		cadenaOriginal = entrada.nextLine();
			
		for(int i = cadenaOriginal.length()-1; i > 0; i--) {
			 char caracter = cadenaOriginal.charAt(i); //obtenemos el caracter en la posicion i
	            cadenaInvertida = cadenaInvertida + caracter;
	        }
	        //mostramos por pantalla la cadena invertida
	        System.out.println("La cadena invertida es: " + cadenaInvertida);
		}
	}

