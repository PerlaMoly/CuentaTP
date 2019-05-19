package ar.edu.unlam.pb2.CuentasTP;

public class CajaAhorros extends CuentaSueldo{
	
	private Integer costoAdicional = 6;
	private Integer extracciones = 5;
	
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
		 Double retiro = 0.0;
		
		if(cantidad < 0) {
			return 0.0;
		}
		else
		if(cantidad > this.saldo) {
			return 0.0;
		}
		
		retiro = this.saldo - cantidad;
		
		this.extracciones ++;
		
		if(this.extracciones > 5) {
			
			retiro = this.saldo - cantidad - this.costoAdicional;
		}
		
		return retiro;
     }
	

}
