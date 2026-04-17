package LibroyLibroDigital;
/*
Se creó la clase Libro con atributos título y autor.

La clase LibroDigital hereda de Libro y agrega el tamaño en MB.

Se sobrescribió el método mostrarInfo() para incluir
el tamaño del archivo digital.

Se utilizó super.mostrarInfo() para reutilizar
la información del libro base.
*/
public class Libro {
	
	    protected String titulo;
	    protected String autor;

	    public Libro(String titulo, String autor) {
	        this.titulo = titulo;
	        this.autor = autor;
	    }

	    public void mostrarInfo() {
	        System.out.println("Título: " + titulo);
	        System.out.println("Autor: " + autor);
	    }
	}

