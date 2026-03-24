package exa2ende2526.enunciado;

public class CuentaAhorro extends CuentaBancaria {
	
	private double tasaInteres;

	public CuentaAhorro(String titular, double saldoInicial) {
		super(titular, saldoInicial);
		this.tasaInteres = tasaInteres;
		
		
	}
	
	public double calcularInteres() {
		return tasaInteres * saldo; 
	}

}
