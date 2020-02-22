package com.Polimorfismo.Pedro;

public class PolimorfismoMain {

	public static void main(String[] args) {
		Animal Scooby; 
		Animal Tom;
		Perro Pequeño;
		
		Scooby = new Perro("Perro", "Scooby");
		Tom = new Gato ("Gato", "Tom");
		Pequeño = new Chihuahua("Perrito", "TacosBell");
		Scooby.imprimir();
		Tom.imprimir();
		Pequeño.imprimir();

	}

}
