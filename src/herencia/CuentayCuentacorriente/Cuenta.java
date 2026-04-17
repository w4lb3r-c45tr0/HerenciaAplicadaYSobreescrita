package herencia.CuentayCuentacorriente;

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
