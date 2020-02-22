package ProgramacionOO;

import java.util.Scanner;

public class HerenciaPersona {
	
	static Scanner entrada = new Scanner(System.in);
	public static void main(String Args[]) {
		String nom;
		int ed;
		String id;
		
		System.out.println("Ingrese el Nombre del Profesor ");
		nom = entrada.next();
		System.out.println("Ingrese la Edad del Profesor ");
		ed = entrada.nextInt();
		System.out.println("Ingrese el Id del Profesor ");
		id = entrada.next();
		Profesor profesor1 = new Profesor(nom, ed);
		profesor1.setNombre(nom);
		profesor1.setidProfesor(id);
		profesor1.setEdad(ed);
		
		profesor1.mostrarNombre();
		profesor1.mostrarEdad();
		profesor1.mostrarId();
		/*
		System.out.println(profesor1.getNombre());
		System.out.println(profesor1.getEdad());
		System.out.println(profesor1.getidProfesor());
		*/
	
	}
}
