package com.Personal.Pedro;

public class Personal {
	private String nombre;
	private int edad;
	private double salario;
	private int aniosServicio;
	
	public int getAniosServicio() {
		return aniosServicio;
	}
	public void setAniosServicio(int aniosServicio) {
		this.aniosServicio = aniosServicio;
	}

	final static float PLUS = 50000;
	
	public Personal() {
		
	}
	public Personal(String nombre, int edad,  double salario) {
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public float getPLUS() {
		return PLUS;
	}

	@Override
	public String toString() {
		return "Personal [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", PLUS=" + PLUS + "]";
	}

}
