package ar.edu.unlam.pb2.CuentasTP;

public class CuentaSueldo {

	protected Double saldo;

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public CuentaSueldo() {
		this.saldo = 0.0;
	}

	public CuentaSueldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double depositar(Double cantidad) {
		/*if (this.saldo == 0.0) {
			return cantidad;
		}*/
		this.saldo+=cantidad;
		return this.saldo ;

	}

	public Double extraer(Double cantidad) {

		Double retiro = 0.0;
		if ((cantidad < 0) || (cantidad > this.saldo)) {
			return -300.00;
		}
		retiro = this.saldo - cantidad;
		return retiro;
	}

}