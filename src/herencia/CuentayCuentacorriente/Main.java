package herencia.CuentayCuentacorriente;

public class Main {
	
	public static void main(String[] args) {
		ejercicio();
	}
public static void ejercicio() {
	    Cuenta c = new Cuenta(500);
	    c.retirar(200);

	    System.out.println();

	    CuentaCorriente cc = new CuentaCorriente(500, 300);
	    cc.retirar(700); // Permitido
	    cc.retirar(200); // Puede bloquearse
	}

}
