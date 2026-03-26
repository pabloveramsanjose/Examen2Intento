package exa2ende2526.enunciado;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.*;

import javax.management.RuntimeErrorException;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class CuentaAhorroTest {
	
	private ArrayList<CuentaBancaria> listaBancaria;
	private int saldoInicial;
	private int interesEsperado;
	private double tasaInteres;
	private CuentaAhorro cuenta;
	
	
	public CuentaAhorroTest(int saldoInicial, int interesEsperado, double tasaInteres) {
		super();
		this.saldoInicial = saldoInicial;
		this.interesEsperado = interesEsperado;
		this.tasaInteres = tasaInteres;
	}


	@BeforeClass
	public void iniciarClase() {
		listaBancaria = new ArrayList<>();
		System.out.println("=== Creando lista de cuentas para todos los tests ===");
	}

	@AfterClass
	public void limpiarClase() {
		listaBancaria = null;
        System.out.println("=== Lista de cuentas liberada despu�s de todos los tests ===");

	}
	
	@Before
	public void preparar() {
		  cuenta = new CuentaAhorro("Test", saldoInicial, tasaInteres);
	}
	
	
	@After
	public void limpiar() {
		cuenta = null;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> datos() {
		return Arrays.asList(new Object[][] {
		{1000, 0.05, 50},
		{500, 0.02, 10},
		{2000, 0.03, 60},
		{1500, 0.04, 60},
		{0, 0.05, 0}
	});
		
	}
	
	@Test
	public void testCalcularInteres() {
		CuentaAhorro cuenta = new CuentaAhorro("Test", saldoInicial, tasaInteres);
		
		assertEquals(interesEsperado,cuenta.calcularInteres(), 0.01);
	}

	
	@Ignore("Test ignorado")
	public void testFiscal() {
		throw new RuntimeException( "Esta clase esta ignorada");
	}
}


