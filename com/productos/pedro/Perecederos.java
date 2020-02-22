package com.productos.pedro;

public class Perecederos extends Productos{
	int cant =0;
	double prec=0;
	String nom="";
	int diasVencer;
	
	//Metodo Constructor Clase Perecederos
	public Perecederos(String nombre, int cantidad, double precio) {
		super(nombre, cantidad, precio);
		this.nom = nombre;
		this.cant = cantidad;
		this.prec = precio;
		this.diasVencer();
		
	}

	private void diasVencer() {
		
		
	}

	@Override
	public double calcular() {
		return precio * cant;
		
	}

}
