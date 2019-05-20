package ar.edu.unlam.pb2.CuentasTP;

public class CajaAhorros extends CuentaSueldo {
	private Double costoAdicional = 6.00;
	private Integer extracciones = 0;

	public Double getCostoAdicional() {
		return costoAdicional;
	}

	public void setCostoAdicional(Double costoAdicional) {
		this.costoAdicional = costoAdicional;
	}

	public Integer getExtracciones() {
		return extracciones;
	}

	public void setExtracciones(Integer extracciones) {
		this.extracciones = extracciones;
	}

	public CajaAhorros(Double saldo) {
		super(saldo);
	}

	public CajaAhorros() {

	}

	@Override
	public Double extraer(Double cantidad) {

		if ((cantidad > this.saldo) || (cantidad < 0.0)) {
			return -300.00;

		}
		this.extracciones++;
		if (this.extracciones > 5) 
		{

			if (this.saldo >= (cantidad + costoAdicional)) 
			{
				this.saldo -= (cantidad + costoAdicional);
				this.extracciones++;
			} else 
				
			{
				this.extracciones --;
				return -300.00;
				
			}
		} else {

			this.saldo -= cantidad;
			
		}

		return this.saldo;
	}

}
