package ColeccionesDatos;
import java.util.Scanner;

public class BuscarMayusMinus {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		String password;
		
		System.out.println("Ingresa una Cadena");
		password = entrada.next();
		
		esFuerte(password);
	}
	
public static void esFuerte(String password) {
		
	int min = 0;
	int may = 0;
	    for(int i = 0; i < password.length(); i++) {
	    	char letra = password.charAt(i);
	    	
	    	if(Character.isLowerCase(letra)) {
				min += 1;
			}
	    	if(Character.isUpperCase(letra)) {
				may += 1;
			}
	    	
	    }
    System.out.println("Mayusculas " +may + " Minusculas " + min);
    		boolean fuerte = false;
    		if(may >= 2 && min >= 5) {
    			fuerte = true;
			System.out.println(fuerte);
    		}else {
    			System.out.println(fuerte);
    		}
	}

}
