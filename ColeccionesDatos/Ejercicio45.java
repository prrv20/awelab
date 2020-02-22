package ColeccionesDatos;

import java.util.Scanner;

public class Ejercicio45 {
	public static void main(String[] args) {
	//Declaracion Arreglo Alfabeto
			char[] alfabeto= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
			//Declarar Variable para guardar datos consultados
			String final_text="";
			//Variable pos(poscision
			int pos = 0;
			//Captura datos de entrada mediante el scanner
			try (Scanner numero = new Scanner(System.in)) {
				//Condicion si es distinta de -1 pasara a lo que hay dentro si no terminara.
				while (pos!=-1) {
					System.out.println("Introduzca su numero de 0-26 y -1 para finalizar");
					//Leemos nuestro dato por consola y lo insertamos en nuestra pos
					pos=numero.nextInt();
					//Condicion para verificar nuestra pos y que no sea menos que -1 solo de 0 hacia el 26 (27 numeros)
					if (pos>=0&&pos<alfabeto.length) {
						//Asignamos el valor consulado a nuestro resultado final
						final_text+=alfabeto[pos];
					}
					
				} //Fin While
				//Imprimero nuestra cadena de resultado final
				System.out.println("El resultado final es: "+final_text);
			}
}
}
