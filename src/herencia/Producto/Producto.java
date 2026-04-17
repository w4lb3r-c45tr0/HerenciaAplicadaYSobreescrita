package herencia.Producto;
/*
Se creó la clase Producto con atributos nombre y precio.

Se creó la clase ProductoPerecedero que hereda de Producto
y agrega la fecha de vencimiento.

Se implementó el método estaVencido() para determinar
si el producto está vencido.

Se sobrescribió el método mostrarInfo() para incluir
la fecha de vencimiento y el estado del producto.

Se utilizó super.mostrarInfo() para reutilizar la información base.
*/
public class Producto {

    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }
}