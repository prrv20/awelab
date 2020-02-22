package ColeccionesDatos;
import java.util.Scanner;

public class vocalEnPalabra {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto;
		String vocal ;
		int repite = 0;
		
		System.out.println("Ingresa una Frase");
		texto = entrada.nextLine();
		System.out.println("Que Vocal Buscas ");
		vocal = entrada.next();
		char caracter = vocal.charAt(0);
		
		for(int i = 0; i < texto.length(); i++) {
			char auxiliar = texto.charAt(i);
			if(auxiliar == caracter) {
				repite += 1;
			}
		}
		
		System.out.println("La Vocal "+ vocal + " se repite "+repite+" veces");
	}

}
