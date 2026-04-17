package SistemaFacturacion;
/*
Se creó la clase Factura como clase base con atributos
número, cliente y total.

Se creó la clase Cliente para representar los datos del cliente.

Se crearon dos clases hijas:
- FacturaContado, que aplica un descuento.
- FacturaCredito, que aplica un recargo y maneja cuotas.

Se sobrescribió el método calcularTotal() en ambas clases
para modificar el cálculo del total.

Se utilizó super para reutilizar atributos y métodos.

Se validó que el total no sea negativo.

Se aplicó encapsulamiento, herencia y polimorfismo.
*/
public class Cliente {
	
	    private String nombre;
	    private String nit;

	    public Cliente(String nombre, String nit) {
	        this.nombre = nombre;
	        this.nit = nit;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getNit() {
	        return nit;
	    }
	}

