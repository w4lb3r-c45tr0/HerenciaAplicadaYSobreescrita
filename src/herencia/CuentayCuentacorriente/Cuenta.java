package herencia.CuentayCuentacorriente;
/*
Se creó la clase Cuenta como clase base con el atributo saldo.

Se implementó el método retirar() que permite retirar dinero
solo si hay saldo suficiente.

Se creó la clase CuentaCorriente que hereda de Cuenta
y agrega un límite de sobregiro.

Se sobrescribió el método retirar() utilizando @Override
para permitir retirar dinero incluso si el saldo queda negativo,
siempre que no supere el límite de sobregiro.

Se utilizaron getters y setters para acceder al saldo.
*/
public class Cuenta {

	private double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}
	public void retirar(double monto) {
	    if (monto <= saldo) {
	        saldo -= monto;
	        System.out.println("Retiro exitoso");
	    } else {
	        System.out.println("Saldo insuficiente");
	    }
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	} 
	
	
	
}
