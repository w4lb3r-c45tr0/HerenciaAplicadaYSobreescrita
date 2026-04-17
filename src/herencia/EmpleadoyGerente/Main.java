package herencia.EmpleadoyGerente;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== EMPLEADO ===");
        Empleado e = new Empleado("Carlos", 3000);
        e.mostrarInfo();

        System.out.println("\n=== GERENTE ===");
        Gerente g = new Gerente("Ana", 3000, 1000);
        g.mostrarInfo();
    }
}