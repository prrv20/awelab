package com.productos.pedro;

public class MainProductos {

	public static void main(String[] args) {
		
		Productos venta[] = new Productos[10];
		
		Perecederos carnes = new Perecederos(null, 0, 0);
		
		venta[0] = new Perecederos("Pollo", 3, 120); 
		venta[0].setNombre("Pollo");
		venta[0].setCantidad(3);
		venta[0].setPrecio(120);
		System.out.println(venta[0]);
	}

}
