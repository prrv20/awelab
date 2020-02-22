package com.productos.pedro;

public class Productos extends Object{
	private String nombre;
	protected double precio;
	protected int cantidad;
	protected double total;
	
	
	public void Productos() {
		
	}
		
	public Productos(String nombre, int cantidad, double precio) {
		
	}
	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", total=" + total
				+ "]";
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public  double calcular() {
		return 0;
	}
}
