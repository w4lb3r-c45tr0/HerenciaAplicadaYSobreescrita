package herencia.persona;


//Se aplicó herencia creando la clase Persona como clase base,
//con atributos nombre y edad.

//Se crearon dos clases hijas:
//- Estudiante, que agrega el atributo carnet.
//- Docente, que agrega el atributo especialidad.

//Se utilizó super() para inicializar atributos heredados.

//Se sobrescribió el método mostrar() en las clases hijas
//usando @Override y super.mostrar() para reutilizar código.



public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		
	} 
	
	public void mostrar() {
		
		    System.out.println("Nombre: " + nombre);
		    System.out.println("Edad: " + edad);
		
		
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

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", getNombre()=" + getNombre() + ", getEdad()="
				+ getEdad() + "]";
	}
	
	} 
	
