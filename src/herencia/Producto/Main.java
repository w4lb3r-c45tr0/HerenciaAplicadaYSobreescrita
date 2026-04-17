package herencia.Producto;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== PRODUCTO NORMAL ===");
        Producto p = new Producto("Arroz", 10.50);
        p.mostrarInfo();

        System.out.println("\n=== PRODUCTO PERECEDERO ===");
        ProductoPerecedero pp = new ProductoPerecedero("Leche", 8.75, "2024");
        pp.mostrarInfo();
    }
}