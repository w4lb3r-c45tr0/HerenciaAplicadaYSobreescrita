package herencia.CuentayCuentacorriente;

public class CuentaCorriente extends Cuenta {
	
	private double sobregiro;

	public CuentaCorriente(double saldo, double sobregiro) {
		super(saldo);
		this.sobregiro = sobregiro;
	}

	@Override
	public void retirar(double monto) {
	    if (getSaldo() - monto >= -sobregiro) {
	        setSaldo(getSaldo() - monto);
	        System.out.println("Retiro con sobregiro permitido");
	    } else {
	        System.out.println("Límite de sobregiro excedido");
	    }
	}

	
	
	

}
