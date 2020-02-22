package com.herenciaMultiple.Pedro;

public class Atleta implements Ciclista, Corredor, Nadador{

	@Override
	public void Nadar() {
		
		//Nadador.super.Nadar();
		System.out.println("El Atleta esta Mojado");
	}

	@Override
	public void Corres() {
		
		//Corredor.super.Corres();
		System.out.println("El Atleta se Quitó los Zapatos");
	}

	@Override
	public void AndarBici() {
		
		//Ciclista.super.AndarBici();
		System.out.println("El Atleta se le Pinchó una Llanta");
	}
	
}
