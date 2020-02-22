package ProgramacionOO;

public class Principal {

	public static void main(String[] args) {
		//Creamos una Instancia de la Clase Trabajadores
		Trabajadores trabajador1 = new Trabajadores();
		trabajador1.setNombre("Juan");
		trabajador1.setCargo("Supervisor");
		trabajador1.setSueldo(2500);
		
		//Creamos otra Instancia de la Clase Trabajadores
		Trabajadores trabajador2 = new Trabajadores();
		trabajador2.setNombre("Jose");
		trabajador2.setCargo("Gerente");
		trabajador2.setSueldo(5000);
				
		System.out.println(trabajador1.getNombre()+" "+trabajador1.getCargo()+" "+trabajador1.getSueldo());
		System.out.println(trabajador2.getNombre()+" "+trabajador2.getCargo()+" "+trabajador2.getSueldo());
	}

}
