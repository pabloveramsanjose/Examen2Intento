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

	
		
	}

