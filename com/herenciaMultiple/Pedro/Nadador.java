package com.herenciaMultiple.Pedro;

public interface Nadador {
	public default void Nadar() {
		System.out.println("El Atleta está Nadando");
	}
}
