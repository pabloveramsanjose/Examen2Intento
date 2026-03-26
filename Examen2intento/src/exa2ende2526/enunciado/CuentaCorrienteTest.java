package exa2ende2526.enunciado;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class CuentaCorrienteTest {
	
	private int saldoInicial;
	private int comision;
	private int interesEsperado;
	
	private CuentaCorriente cuenta;
	
	@Parameterized.Parameters
	public static Collection<Object[]> datos() {
		return Arrays.asList(new Object[][] {
			{1000, 10, -10},
			{500, 5, -5},
			{2000, 20, -20},
			{1500, 0, 0},
			{0, 15, -15}
			
		});
	}
	
	@Test
	public void Test() {
	CuentaCorriente	cuenta = new CuentaCorriente("Test",saldoInicial, comision);
	
	assertEquals(interesEsperado, cuenta.calcularInteres(), 0,01);
	
	}


}
	
	