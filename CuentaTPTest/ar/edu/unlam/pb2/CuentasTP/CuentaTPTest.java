package ar.edu.unlam.pb2.CuentasTP;

import org.junit.Assert;
import org.junit.Test;

public class CuentaTPTest {

	@Test
	public void probarDepositarDeLacuentaSueldo() {
		CuentaSueldo miCuenta = new CuentaSueldo();
		Double esperado = miCuenta.depositar(4000.00);
		Double valorObtenido = miCuenta.getSaldo();
		Assert.assertEquals(esperado, valorObtenido);

	}

	@Test
	public void probarExtraerDeLacuentaSueldo() {
		CuentaSueldo miCuenta = new CuentaSueldo();
		Double saldoCuenta = miCuenta.depositar(4000.00);
		Double esperado = miCuenta.extraer(500.00);
		Double obtenido = saldoCuenta - 3500.00;
		Assert.assertEquals(esperado, obtenido);

	}

	@Test
	public void probarExtraerDeLacuentaSueldoCuandoNoTieneSaldo() {
		CuentaSueldo miCuenta = new CuentaSueldo();
		Double saldoCuenta = miCuenta.depositar(0.00);
		Double obtenido = miCuenta.extraer(1.00);
		Assert.assertEquals(0.00, obtenido, 00.00);

	}

	@Test
	public void probarDepositarDeLaCuentaCajaDeAhorro() {
		CajaAhorros miCuenta = new CajaAhorros();
		Double esperado = miCuenta.depositar(4000.00);
		Double valorObtenido = miCuenta.getSaldo();
		Assert.assertEquals(esperado, valorObtenido);

	}

	@Test
	public void probarExtraerDeLaCajaDeAhorros() {
		CajaAhorros miCuenta = new CajaAhorros();
		Double saldoCuenta = miCuenta.depositar(4000.00) - 3500.00;
				Double obtenido = miCuenta.extraer(500.00);
		Assert.assertEquals(saldoCuenta, obtenido, 00.0);

	}

	@Test
	public void probarMasDeCincoExtracciones() {
		CajaAhorros miCuenta = new CajaAhorros();
		Double saldoCuenta = miCuenta.depositar(4000.00);
		Double extraccion1 = miCuenta.extraer(500.00);
		Double extraccion2 = miCuenta.extraer(500.00);
		Double extraccion3 = miCuenta.extraer(500.00);
		Double extraccion4 = miCuenta.extraer(500.00);
		Double extraccion5 = miCuenta.extraer(100.00);

		Assert.assertEquals(100.00, extraccion5, 00.0);

	}

	@Test
	public void probarDepositarDeLaCuentaCorriente() {
		CuentaCorriente miCuenta = new CuentaCorriente();
		Double esperado = miCuenta.depositar(4000.00);
		Double valorObtenido = miCuenta.getSaldo();
		Assert.assertEquals(esperado, valorObtenido);

	}
	
	
	@Test
	public void probarExtraerDeLaCuentaCorrienteSinSobregiro() {
		CuentaCorriente miCuenta = new CuentaCorriente();
		Double saldoCuenta = miCuenta.depositar(4000.00) - 3500.00;
		Double obtenido = miCuenta.extraer(500.00);
		Assert.assertEquals(saldoCuenta, obtenido, 00.0);

	}
	
	
	@Test
	public void probarExtraerDeLaCuentaCorrienteconSobregiro() {
		CuentaCorriente miCuenta = new CuentaCorriente();
		Double saldoCuenta = miCuenta.depositar(100.00);
		Double limite = miCuenta.getLimite();
		Double obtenido = miCuenta.extraer(200.00);
		Assert.assertEquals(200.00, obtenido, 00.0);

	}
	
}
