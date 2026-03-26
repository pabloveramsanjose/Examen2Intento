package exa2ende2526.enunciado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CuentaBancariaExcepciones {


	// --- CUENTA AHORRO ---
	
	@Test
	
	public void TestExcepcionIngresar() {
		
		CuentaCorriente cuenta = new CuentaCorriente("Ana", 1000,  0.05);
		
		Exception excepcion = assertThrows(IllegalArgumentException.class, () -> cuenta.ingresar(-100)); 
		
		
	}
	
	public void TestExcepcionReintegrar() {
		
		CuentaCorriente cuenta = new CuentaCorriente("Ana", 1000,  0.05);
		
		Exception excepcion = assertThrows(IllegalArgumentException.class, () -> cuenta.reintegrar(-100)); 
		
		
	}
	
	public void TestSobrePasar() {
		CuentaCorriente cuenta = new CuentaCorriente ("Ana", 1000, 0.05);
		
		Exception excepcion = assertThrows(IllegalArgumentException.class,() -> cuenta.reintegrar(2000));
	}
}