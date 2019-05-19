package ar.edu.unlam.pb2.CuentasTP;

public class CuentaSueldo {
	
	protected Double saldo;
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public CuentaSueldo() {
		
	}
	
	public CuentaSueldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Double depositar (Double cantidad) {
		
		if(this.saldo == 0)
		{
			return cantidad;
		}
		
		return cantidad + this.saldo;
	}
	
	public Double extraer(Double cantidad) {
		Double retiro = 0.0;
		
		if(cantidad < 0) {
			return 0.0;
		}else if (cantidad > this.saldo) {
			return 0.0;
		}
		
		retiro = this.saldo - cantidad;
		
		return retiro;
		
	}
	
}
