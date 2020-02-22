package ColeccionesDatos;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaArreglo {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String Args[]) {
		String nombre;
		String eliminar;
		String busca;
		// Creando una ArrayList genérica  
	    ArrayList <String> curso = new ArrayList<String>(); 

	    // Tamaño de arrayList  
	    System.out.println("Tamaño de ArrayList en la creación:" + curso.size());
	    System.out.println();
	    //Rellenamos el ArrayList
	    for (int i = 0; i<10;i++) {
	    	System.out.println("Ingresa un Nombre ");
	    	nombre = entrada.nextLine();
	    	curso.add(i,nombre);
	    }
	   
	    // Verificar el tamaño después de agregar elementos 
	    System.out.println("Tamaño de ArrayList después de agregar elementos:" + curso.size());  

	    // Mostrar todos los contenidos de ArrayList  
	    System.out.println("Lista de todos los elementos:" + curso);  

	    // Eliminar alguno elementos de la lista  
	    System.out.println("Ingresa un Nombre a Eliminar");
    	eliminar = entrada.nextLine();
	    curso.remove(eliminar);
	    
	    System.out.println("Ver contenido después de eliminar un elemento:" + curso);  

	    // Eliminar elemento por índice  arlTest.remove (2);  
	    //System.out.println("Ver contenido después de eliminar elemento por índice:" + curso);  

	    // Verifique el tamaño después de eliminar los elementos  
	    System.out.println("Tamaño de arrayList después de eliminar elementos:" + curso.size()); 
	    //System.out.println("Lista de todos los elementos después de eliminar elementos:" + curso);  

	    // Verifica si la lista contiene un elemento especifico 
	    System.out.println("Ingresa un Nombre a Buscar");
    	busca = entrada.nextLine();
	    curso.contains(busca);
	    System.out.println(curso.contains(busca)); 

		}
	}
	 


