package herencia.VehiculoyMoto;

public class Main {

	public static void main(String[] args) {

		        System.out.println("=== VEHICULO ===");
		        Vehiculo v = new Vehiculo("Toyota", 120);
		        v.mostrarInfo();

		        System.out.println("\n=== MOTO ===");
		        Moto m = new Moto("Yamaha", 180, 600);
		        m.mostrarInfo();
		    }
		}
	

