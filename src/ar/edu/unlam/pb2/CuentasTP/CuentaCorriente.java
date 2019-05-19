package ar.edu.unlam.pb2.CuentasTP;

public class CuentaCorriente extends CuentaSueldo {
      
	private Double limite;

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	public CuentaCorriente (Double saldo, Double limite)
	{
		super(saldo);
		this.limite = limite;
	}
	
	@Override
	public Double extraer(Double cantidad) {
		
		Double retiro  = 0.0;
		Double recargo = (5 * this.limite)/100;
		
		
		if(cantidad<0) {
			return 0.0;
		}
		
		if(cantidad > this.saldo) {
			retiro = this.limite - cantidad - recargo;
			return retiro;
		}
		
		retiro = this.saldo - cantidad;
		
		return retiro;
	}
	
}
