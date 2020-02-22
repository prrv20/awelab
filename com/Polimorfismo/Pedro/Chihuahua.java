package com.Polimorfismo.Pedro;

public class Chihuahua extends Perro{
	private String nombre;
	
	public Chihuahua(String especie, String nombre) { 
		 super(especie, nombre);
		 this.nombre = nombre; 
		 } 
	 
	 public void imprimir() { 
		 super.imprimir(); 
		 System.out.println("Soy un Chihuahueño");
		 }
	 
	 public String getNombre() { 
		 return nombre; 
		 } 
	 
	 public void setNombre(String nombre) { 
		 this.nombre = nombre; 
		 }
}
