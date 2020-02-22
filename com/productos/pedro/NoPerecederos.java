package com.productos.pedro;

public class NoPerecederos extends Productos{
	String nom;
	 int cant;
	 double prec;
	 double tot;
	 
	public NoPerecederos(String nombre, int cantidad, double precio, double total) {
		super( nombre, cantidad, precio);
		this.nom = nombre;
		this.cant = cantidad;
		this.prec = precio;
		this.tot = total;
	}

	public double calcular(int cant, double precio) {
		
		return precio * cant;
	}
}
