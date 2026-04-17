package herencia.persona;

public class Main {

	public static void main(String[] args) {
		ejercicio();
	}
	public static void ejercicio() {
		Persona p = new Persona ("Juan", 33 );
		Estudiante e = new Estudiante("Luis", 33, 44);
		Docente d = new Docente("Alex", 55, "Estadística");
		
		System.out.println("--Persona--");
		p.mostrar();
		
		System.out.println("--Estudiante--");
		e.mostrar();
		
		System.out.println("--Docente--");
		d.mostrar();
	}
	
}
