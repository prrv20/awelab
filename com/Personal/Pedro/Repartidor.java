package com.Personal.Pedro;

public class Repartidor extends Personal{
	String nom = "";
	int ed = 0;
	double sal = 0;
	String zona;
	
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	int anios;
	public Repartidor() {
		
	}
	public Repartidor(String nombre, int edad, int anioServicio,double salario, String zona ) {
		super(nombre, edad, salario);
		this.nom = nombre;
		this.ed = edad;
		this.anios = anioServicio;
		this.sal = salario;
		this.zona = zona;
		
	}
	public static double PagarPlus(int anios, String zona, double sal) {
		if(anios > 25 && zona == ("zona 3")) {
			sal = sal + PLUS;
		}
		return sal;
		
	}
	@Override
	public String toString() {
		return "Repartidor [nombre=" + nom + ", edad=" + ed + ", salario=" + sal + ", zona=" + zona + ", años=" + anios + "]";
	}

}
