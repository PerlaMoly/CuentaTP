package ar.edu.unlam.pb2.CuentasTP;

public class CuentaSueldo {

	protected Double saldo;

	public Double getSaldo() {
		return this.saldo;
	}

/*	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
*/
	public CuentaSueldo() {

	}

	public CuentaSueldo(Double saldo) {
		this.saldo = saldo;
	}


	public Double depositar(Double cantidad) {
		 
			this.saldo=cantidad;
		
			return this.saldo;
	
	}
	
	
	public Double extraer(Double cantidad) {

		if (saldo >= cantidad && cantidad > 0.00) {
			return cantidad;
		}
		return 0.00;

	}

}
