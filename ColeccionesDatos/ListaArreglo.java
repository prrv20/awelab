package ColeccionesDatos;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaArreglo {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String Args[]) {
		String nombre;
		String eliminar;
		String busca;
		// Creando una ArrayList gen�rica  
	    ArrayList <String> curso = new ArrayList<String>(); 

	    // Tama�o de arrayList  
	    System.out.println("Tama�o de ArrayList en la creaci�n:" + curso.size());
	    System.out.println();
	    //Rellenamos el ArrayList
	    for (int i = 0; i<10;i++) {
	    	System.out.println("Ingresa un Nombre ");
	    	nombre = entrada.nextLine();
	    	curso.add(i,nombre);
	    }
	   
	    // Verificar el tama�o despu�s de agregar elementos 
	    System.out.println("Tama�o de ArrayList despu�s de agregar elementos:" + curso.size());  

	    // Mostrar todos los contenidos de ArrayList  
	    System.out.println("Lista de todos los elementos:" + curso);  

	    // Eliminar alguno elementos de la lista  
	    System.out.println("Ingresa un Nombre a Eliminar");
    	eliminar = entrada.nextLine();
	    curso.remove(eliminar);
	    
	    System.out.println("Ver contenido despu�s de eliminar un elemento:" + curso);  

	    // Eliminar elemento por �ndice  arlTest.remove (2);  
	    //System.out.println("Ver contenido despu�s de eliminar elemento por �ndice:" + curso);  

	    // Verifique el tama�o despu�s de eliminar los elementos  
	    System.out.println("Tama�o de arrayList despu�s de eliminar elementos:" + curso.size()); 
	    //System.out.println("Lista de todos los elementos despu�s de eliminar elementos:" + curso);  

	    // Verifica si la lista contiene un elemento especifico 
	    System.out.println("Ingresa un Nombre a Buscar");
    	busca = entrada.nextLine();
	    curso.contains(busca);
	    System.out.println(curso.contains(busca)); 

		}
	}
	 


