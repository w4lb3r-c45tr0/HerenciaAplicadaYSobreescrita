package herencia.TransporteYBus;
/*
Se creó la clase Transporte con el atributo capacidad.

La clase Bus hereda de Transporte y agrega la ruta.

Se sobrescribió el método descripcion() en la clase Bus
para mostrar la ruta además de la capacidad.

Se utilizó super.descripcion() para reutilizar
el comportamiento de la clase padre.
*/
public class Transporte {

	    protected int capacidad;

	    public Transporte(int capacidad) {
	        this.capacidad = capacidad;
	    }

	    public void descripcion() {
	        System.out.println("Capacidad: " + capacidad + " personas");
	    }
	}

