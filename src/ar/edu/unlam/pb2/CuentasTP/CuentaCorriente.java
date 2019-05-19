package ar.edu.unlam.pb2.CuentasTP;

public class CuentaCorriente extends CuentaSueldo {

	private Double limite=150.00;

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public CuentaCorriente(Double saldo) {
		super(saldo);
		this.limite = limite;
	}

	public CuentaCorriente() {
	}

	@Override
	public Double extraer(Double cantidad) {

		if (saldo<cantidad && cantidad > 0.0) {

			if ((cantidad - saldo) <= limite) {

				this.saldo -= (limite * 1.05);
				return cantidad;
			}

		}
		return cantidad;
	}

}
