package ColeccionesDatos;
import java.util.Scanner;

public class ArreglosANinados {
	
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		String nombres[] = new String[5];
		String edades[] = new String[5];
		String union[] = new String[10];

		for(int i = 0; i < 5; i++) {
			System.out.print("Ingrese el Nombre ");
			nombres[i]= entrada.next();
			System.out.print("Ingrese la Edad ");
			edades[i] = entrada.next();
		}
		/*int j = 0;
		for(int i = 0; i < 10; i++) {
			union[j]= nombres[i];
			j++;
			union[j]= edades[i];
			j++;
		}*/
		
		for(int i = 0; i < 5; i++) {
			//System.out.print(nombres[i]+" ");
			//System.out.println(edades[i]);
			System.out.println(nombres[i]+" "+edades[i]);
			}			
	}

}
