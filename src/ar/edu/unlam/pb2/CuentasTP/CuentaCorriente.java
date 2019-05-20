package ar.edu.unlam.pb2.CuentasTP;

public class CuentaCorriente extends CuentaSueldo {

	private Double limite;

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public CuentaCorriente(Double saldo, Double limite) {
		super(saldo);
		this.limite = limite;
	}

	/*
	 * public CuentaCorriente() { }
	 */

	public CuentaCorriente() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double extraer(Double cantidad) {
		Double retiro = 0.00;

		if ((cantidad < 0.0) || (cantidad > this.saldo + this.limite)) {

			return -300.00;
		}

		if ((cantidad > this.saldo) && ((cantidad - this.saldo) < this.limite)) {

			retiro -= this.saldo - ((cantidad - this.saldo));
			this.saldo -= retiro * 1.05;
			this.limite -= retiro;

		}

		else {
			this.saldo -= cantidad;
		}
		return this.saldo;
	}

}
