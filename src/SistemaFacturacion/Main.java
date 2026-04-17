package SistemaFacturacion;

public class Main {

	    public static void main(String[] args) {

	        Cliente c = new Cliente("Juan Perez", "1234567");

	        System.out.println("=== FACTURA CONTADO ===");
	        FacturaContado fc = new FacturaContado(1, c, 1000, 100);
	        fc.mostrarFactura();

	        System.out.println("\n=== FACTURA CREDITO ===");
	        FacturaCredito fcr = new FacturaCredito(2, c, 1000, 200, 6);
	        fcr.mostrarFactura();
	    }
	}

