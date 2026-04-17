package herencia.VehiculoyMoto;
/*
Se creó la clase Vehiculo con atributos marca y velocidad.

La clase Moto hereda de Vehiculo y agrega la cilindrada.

Se sobrescribió el método mostrarInfo() en la clase Moto
para incluir la cilindrada.

Se utilizó super.mostrarInfo() para reutilizar
la información del vehículo.
*/
public class Vehiculo {
	
	    protected String marca;
	    protected int velocidad;

	    public Vehiculo(String marca, int velocidad) {
	        this.marca = marca;
	        this.velocidad = velocidad;
	    }

	    public void mostrarInfo() {
	        System.out.println("Marca: " + marca);
	        System.out.println("Velocidad: " + velocidad + " km/h");
	    }
	}

