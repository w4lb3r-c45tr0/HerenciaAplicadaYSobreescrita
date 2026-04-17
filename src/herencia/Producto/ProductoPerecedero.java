package herencia.Producto;

public class ProductoPerecedero extends Producto {

    private String fechaVencimiento;

    public ProductoPerecedero(String nombre, double precio, String fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean estaVencido() {
        // Simulación simple
        if (fechaVencimiento.equals("2024")) {
            return true;
        }
        return false;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);

        if (estaVencido()) {
            System.out.println("Estado: Vencido");
        } else {
            System.out.println("Estado: Vigente");
        }
    }
}