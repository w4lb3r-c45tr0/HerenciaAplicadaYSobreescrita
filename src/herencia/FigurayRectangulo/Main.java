package herencia.FigurayRectangulo;

public class Main {

	    public static void main(String[] args) {

	        System.out.println("=== RECTANGULO ===");
	        Rectangulo r = new Rectangulo(5, 3);
	        System.out.println("Área: " + r.calcularArea());

	        System.out.println("\n=== CIRCULO ===");
	        Circulo c = new Circulo(4);
	        System.out.println("Área: " + c.calcularArea());
	    }
	}