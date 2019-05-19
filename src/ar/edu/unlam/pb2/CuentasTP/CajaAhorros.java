package ar.edu.unlam.pb2.CuentasTP;

public class CajaAhorros extends CuentaSueldo {

	private Integer costoAdicional = 6;
	private Integer extracciones = 0; // LA CANTIDAD DE EXTRACCIONES EMPIEZA CON CERO. POR ESO LO CAMBIÉ

	public Integer getCostoAdicional() {
		return costoAdicional;
	}

	public void setCostoAdicional(Integer costoAdicional) {
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

		if ((cantidad <= saldo) && (cantidad > 0.0)) {
			this.saldo = saldo - cantidad;
		
			extracciones += this.extracciones;
		}

		if (extracciones >= 5) {
			saldo = saldo - costoAdicional;
			return cantidad;
		}

		return cantidad;
	}

}
