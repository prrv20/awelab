package com.Polimorfismo.Pedro;

public class PolimorfismoMain {

	public static void main(String[] args) {
		Animal Scooby; 
		Animal Tom;
		Perro Peque�o;
		
		Scooby = new Perro("Perro", "Scooby");
		Tom = new Gato ("Gato", "Tom");
		Peque�o = new Chihuahua("Perrito", "TacosBell");
		Scooby.imprimir();
		Tom.imprimir();
		Peque�o.imprimir();

	}

}
