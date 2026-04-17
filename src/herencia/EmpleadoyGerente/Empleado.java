package herencia.EmpleadoyGerente;
/*
Se creó la clase Empleado con atributos nombre y salario.

La clase Gerente hereda de Empleado y agrega un bono adicional.

Se sobrescribió el método calcularSalario() en la clase Gerente
para sumar el bono al salario base.

Se reutilizó el método mostrarInfo() de la clase padre,
pero con el nuevo cálculo del salario.
*/
public class Empleado {

    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + calcularSalario());
    }
}