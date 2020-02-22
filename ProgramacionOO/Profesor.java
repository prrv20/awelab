package ProgramacionOO;

public class Profesor extends Persona{
	private String idProfesor;
	public Profesor(String nombre, int edad) {
		super(nombre,edad);
	}
	public void setidProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getidProfesor() {
		return idProfesor;
	}
	
	public void mostrarId() {
		System.out.println("Id Profesor : " + getidProfesor());
	}
	
	
}
