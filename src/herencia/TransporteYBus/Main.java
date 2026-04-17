package herencia.TransporteYBus;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== TRANSPORTE ===");
        Transporte t = new Transporte(50);
        t.descripcion();

        System.out.println("\n=== BUS ===");
        Bus b = new Bus(40, "Ruta 5");
        b.descripcion();
    }
}