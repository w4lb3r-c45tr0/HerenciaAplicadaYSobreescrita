package LibroyLibroDigital;

public class Main {

	public static void main(String[] args) {

		        System.out.println("=== LIBRO ===");
		        Libro l = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
		        l.mostrarInfo();

		        System.out.println("\n=== LIBRO DIGITAL ===");
		        LibroDigital ld = new LibroDigital("Java Básico", "Juan Pérez", 5.5);
		        ld.mostrarInfo();
		    }
		}




