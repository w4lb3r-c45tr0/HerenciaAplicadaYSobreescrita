package SistemaFacturacion;

public class FacturaCredito extends Factura{

	    private double recargo;
	    private int cuotas;

	    public FacturaCredito(int numero, Cliente cliente, double total, double recargo, int cuotas) {
	        super(numero, cliente, total);
	        this.recargo = recargo;
	        this.cuotas = cuotas;
	    }

	    @Override
	    public double calcularTotal() {
	        double totalFinal = total + recargo;

	        if (totalFinal < 0) {
	            totalFinal = 0;
	        }

	        return totalFinal;
	    }

	    @Override
	    public void mostrarFactura() {
	        super.mostrarFactura();
	        System.out.println("Cuotas: " + cuotas);
	    }
	}
	

