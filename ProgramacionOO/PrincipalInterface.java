package ProgramacionOO;

import java.util.Scanner;

public class PrincipalInterface {
	
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int inicio = 0;
		int incremeto = 0;
		
		System.out.print("Ingrese un Numero ");
		inicio = entrada.nextInt();
		Acumulador acum = new Acumulador(inicio);
		do {
			System.out.print("Ingrese el Incremento ");
			incremeto = entrada.nextInt();
			acum.incremeto(incremeto);
			System.out.println("Aumenta a " + acum.daValor());
			
		}while(incremeto !=0);
		
		
	}

}
