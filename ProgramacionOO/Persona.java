package ProgramacionOO;

public class Persona {
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		
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
	public void mostrarNombre() {
		System.out.println("Nombre Profesor : " + getNombre());
	}
	public void mostrarEdad() {
		System.out.println("Edad Profesor : " + getEdad());
	}
}


