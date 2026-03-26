package exa2ende2526.enunciado;

public class CuentaCorriente extends CuentaBancaria {
	
	private double comision;

	public CuentaCorriente(String titular, double saldoInicial) {
		super(titular, saldoInicial);
		this.comision  = comision;
	}
	

	public double calcularInteres() {
		return comision;
	}

	public void ingresar(double cantidad) {
		if ( cantidad < 0) {
			throw new IllegalArgumentException("La cantidad no puede ser menor que 0");
		}
		
	}
	
	public void reintegrar(double cantidad) {
		
		if ( cantidad < 0) {
			throw new IllegalArgumentException("La cantida no puede ser negativa");
			
		}
		
		if ( cantidad > saldo) {
			throw new IllegalArgumentException("LA cantidad no puede ser superior al saldo");
		}
		
	}
}
