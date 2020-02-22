package IniciandoJava;
import java.util.Scanner;

public class Promedio {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] Args) {
		int nota = 0;
		int n = 0;
		int acum = 0;
		float prom = 0;
		
		System.out.println("Ingresa la Cantidad de Notas ");
		n = entrada.nextInt();
		
		for(int i = 0; i <n ; i++) {
			System.out.println("Ingresa la Nota "+(i+1));
			nota = entrada.nextInt();
			acum = acum + nota;
		}
		prom = acum/n;
		
		if(prom >= 16) {
			System.out.println("Aprobaste y Obtienes Beca");
		}else if(prom >= 10 && prom < 16){
				System.out.println("Aprobaste");
			}
		else {
			System.out.println("Reprobaste");
		}
			
		
		
		
		
		
		System.out.println("El Promedio es: " + prom);
	}
}
