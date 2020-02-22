package com.Personal.Pedro;

import java.util.Scanner;

public class MainPersonal {

	public static void main(String[] args) {
		String nombre ="";
		int edad=0;
		int anioServicio=0;
		double salario=0;
		String zona="";
		Scanner entrada = new Scanner(System.in);
		
		Repartidor repartidores[] = new Repartidor[1];
		//Repartidor repartidor = new Repartidor();
		/*repartidor.setNombre("Jose");
		repartidor.setEdad(14);
		repartidor.setSalario(2500);
		repartidor.setAniosServicio(26);
		repartidor.setZona("zona 2");*/
		
		for(int i = 0; i < repartidores.length; i++) {
			System.out.println("Ingrese el Nombre ");
			nombre = entrada.next();
			System.out.println("Ingrese la Edad ");
			edad = entrada.nextInt();
			System.out.println("Ingrese el Sueldo ");
			salario = entrada.nextDouble();
			System.out.println("Ingrese los Años de Servicio ");
			anioServicio = entrada.nextInt();
			System.out.println("Ingrese su Zona ");
			zona = entrada.next().toString();
			entrada.nextLine();
			Repartidor miRepartidor = new Repartidor(nombre, edad, anioServicio, salario, zona);
			repartidores[i] = miRepartidor;
		
		}
		for(int i = 0; i < repartidores.length; i++) {
//		
			System.out.println(repartidores[i]);
			Repartidor.PagarPlus(anioServicio, zona, salario);
		}
	}

}
